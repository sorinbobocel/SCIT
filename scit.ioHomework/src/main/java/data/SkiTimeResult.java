package data;

import java.util.Objects;

public class SkiTimeResult {

    int minutes;
    int seconds;

    public SkiTimeResult() {
    }

    public SkiTimeResult(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void addExtraTime(long extraSeconds) {
        for (int i = 0; i < (int) extraSeconds; i++) {
            seconds++;
            if (seconds >= 60) {
                minutes = minutes + 1;
                seconds = 0;
            }
        }
    }

    public int totalTime() {

        int totalTime = (minutes * 60) + seconds;
        return totalTime;
    }

    public String getAthleteTime() {
        return minutes + ":" + seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkiTimeResult that = (SkiTimeResult) o;
        return minutes == that.minutes &&
                seconds == that.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minutes, seconds);
    }

    @Override
    public String toString() {
        return
                minutes +
                        ":" + seconds;
    }
}