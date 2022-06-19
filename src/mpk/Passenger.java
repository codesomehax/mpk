package mpk;

import java.time.LocalDate;

public class Passenger extends Person {
    private LocalDate ticketStartDate;
    private LocalDate ticketEndDate;

    public Passenger(String firstName, String lastName, String birthday, String email, String phone) {
        super(firstName, lastName, birthday, email, phone);
        ticketStartDate = null;
        ticketEndDate = null;
    }

    public LocalDate getTicketStartDate() {
        return ticketStartDate;
    }

    public LocalDate getTicketEndDate() {
        return ticketEndDate;
    }

    public void buyTicket(LocalDate from, LocalDate to) {
        if (ticketEndDate != null) {
            if (from.isBefore(ticketEndDate)) {
                System.out.println("Current ticket has not ended yet");
                return;
            }
        }

        if (from.isBefore(LocalDate.now())) {
            System.out.println("You can't buy a ticket beginning before today's date");
            return;
        }

        ticketStartDate = from;
        ticketEndDate = to;
    }
}
