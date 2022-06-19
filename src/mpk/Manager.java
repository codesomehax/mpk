package mpk;

public class Manager extends Employee {
    private Region region;

    public Manager(String firstName, String lastName, String birthday, String email, String phone, String PESEL, Region region) {
        super(firstName, lastName, birthday, email, phone, PESEL);
        this.region = region;
    }
    
}
