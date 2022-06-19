package mpk;

import java.time.LocalTime;

public class Route {
    private int busNumber;
    private Region region;
    private Station[] stations;
    private LocalTime[][] arrivalTimes;

    public Route(int busNumber, Region region, Station[] stations, LocalTime[][] arrivalTimes) {
        this.busNumber = busNumber;
        this.region = region;
        this.stations = stations;
        this.arrivalTimes = arrivalTimes;
    }
}
