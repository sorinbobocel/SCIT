import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;
        import java.util.Random;

public enum TicketType {
    FULL, FULL_VIP, FREE_PASS, ONE_DAY, ONE_DAY_VIP;

    private static List<TicketType> ticketList =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static int listSize = ticketList.size();
    private static Random randomTicketValueFromListSize = new Random();

    public static TicketType randomTicketType() {
        return ticketList.get(randomTicketValueFromListSize.nextInt(listSize));
    }
}
