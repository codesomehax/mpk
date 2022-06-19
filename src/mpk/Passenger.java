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
}
