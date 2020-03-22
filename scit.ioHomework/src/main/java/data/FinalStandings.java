package data;

import validations.AthleteReader;
import validations.ValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class FinalStandings {

    public List<BiathlonAthlete> getAthletes() throws ValidationException {

        AthleteReader athletes = new AthleteReader();
        try {
            athletes.readAthletesFile(new FileReader("athletes.csv"));
        } catch (IOException e) {
            System.out.println("FIle not found.");
            e.printStackTrace();
        }
        return athletes.getAthleteList();
    }

    public static  int calculatePenlatyTime(String firstShooting, String secondShooting, String thirdShooting) {
        long sum = 0;
        sum = (firstShooting.chars().filter(c -> c == 'o').count()) +
                (secondShooting.chars().filter(c -> c == 'o').count()) +
                (thirdShooting.chars().filter(c -> c == 'o').count());

        return (int) sum * 10;
    }

    public List<BiathlonAthlete> orderedAthletesList() {

        List<BiathlonAthlete> athletesList = getAthletes();
        for (BiathlonAthlete biathlonAthlete : athletesList) {
            System.out.println(biathlonAthlete);
        }
        for (BiathlonAthlete biathlonAthlete : athletesList) {
            int totalPenalty = calculatePenlatyTime(biathlonAthlete.getFirstShooting(), biathlonAthlete.getSecondShooting(), biathlonAthlete.getThirdShooting());
            int timeToBeAdded = totalPenalty;
            SkiTimeResult totalTime = biathlonAthlete.getSkiTimeResult();
            totalTime.addExtraTime(timeToBeAdded);
            biathlonAthlete.setSkiTimeResult(totalTime);
        }
        return athletesList.stream()
                .sorted((b1, b2) -> b1.getSkiTimeResult().totalTime() - b2.getSkiTimeResult().totalTime())
                .collect(Collectors.toList());
    }

    public void printWinners() throws ValidationException {

        List<BiathlonAthlete> winnersList = orderedAthletesList();

        if (winnersList.size() > 0) {
            for (int i = 0; i < winnersList.size(); i++) {

              if(i == 1) {
                  System.out.print("Winner - ");
                  athleteAttributes(winnersList, 0);
              }
               if(i == 2) {
                   System.out.print("\n Runner-up - ");
                   athleteAttributes(winnersList, 1);
               }
               if(i == 3) {
                   System.out.print("\n Third place - ");
                   athleteAttributes(winnersList, 2);
                }
               if(i > 3) {
                   System.out.println("\n ...and others");
               }
            }
        }
    }
    private void athleteAttributes(List<BiathlonAthlete> winnersList, int position) {

        System.out.print(winnersList.get(position).getAthleteName() + " "
                + winnersList.get(position).getSkiTimeResult().getAthleteTime() +  " ("
                +  winnersList.get(position).getSkiTimeResult()+ " + " +
        calculatePenlatyTime(winnersList. get(position).getFirstShooting(),
                winnersList.get(position).getSecondShooting(), winnersList.get(position).getThirdShooting()) + ")");
    }
}



