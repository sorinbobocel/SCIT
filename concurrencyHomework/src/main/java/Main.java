import java.util.Random;

public class Main  {

    public static void main(String[] args) {

            FestivalGate gate = new FestivalGate();
            FestivalStatisticsThread statsThread = new FestivalStatisticsThread(gate);
            statsThread.start();

            int peopleSum = getRandomNumber();

            for (int i = 0; i < peopleSum; i++) {
                runNewAttendeeThread(gate);
            }
        }

        private static int getRandomNumber() {
            Random r = new Random();
            return r.nextInt(1000) + 100;
        }

        private static void runNewAttendeeThread(FestivalGate gate) {
            FestivalAttendeeThread attendeeThread = new FestivalAttendeeThread(gate);
            Thread t1 = new Thread(attendeeThread);

            t1.start();
            try {
                t1.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

