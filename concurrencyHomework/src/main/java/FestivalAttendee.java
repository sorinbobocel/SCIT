public class FestivalAttendee {

    private TicketType ticketType;

    public FestivalAttendee(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    @Override
    public String toString() {
        return "FestivalAttendee (" + ticketType +
                ')';
    }
}
