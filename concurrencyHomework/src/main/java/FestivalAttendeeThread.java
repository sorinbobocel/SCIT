public class FestivalAttendeeThread extends Thread{

        private FestivalGate gate;

        public FestivalAttendeeThread(FestivalGate gate) {
            this.gate = gate;
        }

        public void run() {
            FestivalAttendee  attendee = new FestivalAttendee(TicketType.randomTicketType());
            gate.newFestivalAttendee(attendee);
            System.out.println(attendee);
        }
}
