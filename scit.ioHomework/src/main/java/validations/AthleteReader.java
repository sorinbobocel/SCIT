package validations;

import data.BiathlonAthlete;
import data.SkiTimeResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class AthleteReader {

    public List<BiathlonAthlete> athleteList = new ArrayList<>();

    public void readAthletesFile(Reader reader) throws IOException {

        String csvLine = "";
        String separator = ",";
        String[] athleteInfo;
        try (BufferedReader csvReader = new BufferedReader(reader)) {

            while ((csvLine = csvReader.readLine()) != null) {

                athleteInfo = csvLine.split(separator);

                BiathlonAthlete athlete = new BiathlonAthlete(
                        validateAthleteNumber(athleteInfo[0], csvLine),
                        validatreAthleteName(athleteInfo[1], csvLine),
                        validateCountryCode(athleteInfo[2], csvLine),
                        validateSkiTimeResult(athleteInfo[3], csvLine),
                        validateShooting(athleteInfo[4], csvLine),
                        validateShooting(athleteInfo[5], csvLine),
                        validateShooting(athleteInfo[6], csvLine)
                );
                athleteList.add(athlete);
            }
        }
    }

    public static int validateAthleteNumber(String a, String csvLine) throws ValidationException {
        if (!isInt(a)) {
            throw new ValidationException("Invalid int at line " + csvLine);
        }
        return Integer.parseInt(a);
    }

    private static boolean isInt(String a) {
        try {
            Integer.parseInt(a);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static String validatreAthleteName(String a, String csvLine) throws ValidationException {
        if (a.isEmpty()) {
            throw new ValidationException("Athlete name is missing at line " + csvLine);
        }
        return a;
    }

    public static String validateCountryCode(String a, String csvLine) throws ValidationException {
        if (a.length() != 2) {
            throw new ValidationException("Country code incorrect at line " + csvLine);
        }
        return a.toUpperCase();
    }

    public static SkiTimeResult validateSkiTimeResult(String a, String csvLine) throws ValidationException {

        String[] minSec = a.split(":");
        int minutes = Integer.parseInt(minSec[0]);
        int seconds = Integer.parseInt(minSec[1]);

        if (minSec.length != 2) {
            throw new ValidationException("Invalid format for " + minSec + "at line " + csvLine);
        }
        SkiTimeResult athleteTime = new SkiTimeResult(minutes, seconds);
        return athleteTime;
    }

    public static String validateShooting(String a, String csvLine) throws ValidationException {
        if ((a.length() != 5) || !a.matches("[xo]+")) {
            throw new ValidationException("Invalid characters / number of shootings at line" + csvLine);
        }
        return a;
    }

    public List<BiathlonAthlete> getAthleteList() {
        return athleteList;
    }
}
