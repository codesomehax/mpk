package mpk;

public class Employee extends Person {

    private String PESEL;

    public Employee(String firstName, String lastName, String birthday, String email, String phone, String PESEL) {
        super(firstName, lastName, birthday, email, phone);
        this.PESEL = PESEL;
    }
}
