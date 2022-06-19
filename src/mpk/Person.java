package mpk;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String birthday; // dd/mm/yyyy
    private String email;
    private String phone;

    public Person(String firstName, String lastName, String birthday, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
