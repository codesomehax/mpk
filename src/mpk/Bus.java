package mpk;

public class Bus {
    private String registrationNumber;
    private String model;
    private int year;
    private int[] currentLocation;
    
    public Bus(String registrationNumber, String model, int year, int[] currentLocation) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.year = year;
        this.currentLocation = currentLocation;
    }
}
