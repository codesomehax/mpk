package mpk;

import java.time.LocalTime;
import java.util.List;

public class Route {
    private int routeNumber;
    private Region region;
    private List<Station> stations;
    private List<List<LocalTime>> arrivalTimes;

    public Route(int routeNumber, Region region, List<Station> stations, List<List<LocalTime>> arrivalTimes) {
        this.routeNumber = routeNumber;
        this.region = region;
        this.stations = stations;
        this.arrivalTimes = arrivalTimes;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public Region getRegion() {
        return region;
    }

    public List<Station> getStations() {
        return stations;
    }

    public List<List<LocalTime>> getArrivalTimes() {
        return arrivalTimes;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    public void setArrivalTimes(List<List<LocalTime>> arrivalTimes) {
        this.arrivalTimes = arrivalTimes;
    }
}
