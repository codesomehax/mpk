package mpk;

public class Employee extends Person {

    private String PESEL;
    private Region region;

    public Employee(String firstName, String lastName, String birthday, String email, String phone, String PESEL, Region region) {
        super(firstName, lastName, birthday, email, phone);
        this.PESEL = PESEL;
        this.region = region;
    }

    public String getPESEL() {
        return PESEL;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
