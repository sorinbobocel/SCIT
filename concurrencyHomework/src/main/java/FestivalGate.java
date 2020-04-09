import java.util.LinkedList;
import java.util.Queue;

public class FestivalGate {

    private int fullTicket;
    private int fullVipTicket;
    private int freePassTicket;
    private int oneDayTicket;
    private int oneDayVipTicket;

  Queue<FestivalAttendee> gateQueue = new LinkedList<>();

    public synchronized void newFestivalAttendee(FestivalAttendee attendee) {

        gateQueue.add(attendee);
    }

    private int returnRegisteredEntries() {

        int sum = fullTicket + fullVipTicket + freePassTicket + oneDayTicket + oneDayVipTicket;
        return sum;
    }

    public synchronized void gatherStatisticalData() {

        for (int i = 0; i <= gateQueue.size(); i++) {

            switch (gateQueue.poll().getTicketType()) {
                case FULL:
                    fullTicket++;
                    break;
                case FULL_VIP:
                    fullVipTicket++;
                    break;
                case FREE_PASS:
                    freePassTicket++;
                    break;
                case ONE_DAY:
                    oneDayTicket++;
                    break;
                case ONE_DAY_VIP:
                    oneDayVipTicket++;
                    break;
                default:
                    break;
            }
        }

        System.out.println(returnRegisteredEntries() + " people entered");
        System.out.println(fullTicket + " people have full tickets");
        System.out.println(fullVipTicket + " have full VIP passes");
        System.out.println(freePassTicket + " have free passes");
        System.out.println(oneDayTicket + " have one-day passes");
        System.out.println(oneDayVipTicket + " have one-day VIP passes");
    }
}