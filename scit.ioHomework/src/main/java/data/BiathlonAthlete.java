package data;

public class BiathlonAthlete {

    int athleteNumber;
    String athleteName;
    String countryCode;
    SkiTimeResult skiTimeResult;
    String firstShooting;
    String secondShooting;
    String thirdShooting;

    public BiathlonAthlete(int athleteNumber, String athleteName, String countryCode, SkiTimeResult skiTimeResult, String firstShooting, String secondShooting, String thirdShooting) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShooting = firstShooting;
        this.secondShooting = secondShooting;
        this.thirdShooting = thirdShooting;
    }

    public int getAthleteNumber() {
        return athleteNumber;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public SkiTimeResult getSkiTimeResult() {
        return skiTimeResult;
    }

    public void setSkiTimeResult(SkiTimeResult skiTimeResult) {
        this.skiTimeResult = skiTimeResult;
    }

    public String getFirstShooting() {
        return firstShooting;
    }

    public String getSecondShooting() {
        return secondShooting;
    }

    public String getThirdShooting() {
        return thirdShooting;
    }

    public SkiTimeResult getAthleteTime() {
        return skiTimeResult;
    }

    @Override
    public String toString() {
        return "BiathlonAthlete{" +
                "athleteNumber=" + athleteNumber +
                ", athleteName='" + athleteName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", skiTimeResult=" + skiTimeResult +
                ", firstShooting='" + firstShooting + '\'' +
                ", secondShooting='" + secondShooting + '\'' +
                ", thirdShooting='" + thirdShooting + '\'' +
                '}';
    }
}
