package data;

import java.util.Comparator;

public class TotalTimeComparator implements Comparator<BiathlonAthlete> {

    @Override
    public int compare(BiathlonAthlete b1, BiathlonAthlete b2) {
        if (b1.getSkiTimeResult().totalTime() > b2.getSkiTimeResult().totalTime()) {
            return 1;
        } else if (b1.getSkiTimeResult().totalTime() < b2.getSkiTimeResult().totalTime()) {
            return -1;
        } else {
            return 0;
        }
    }
}