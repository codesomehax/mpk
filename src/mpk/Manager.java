package mpk;

import java.time.LocalTime;
import java.util.List;

public class Manager extends Employee {
    private Region region;

    public Manager(String firstName, String lastName, String birthday, String email, String phone, String PESEL, Region region) {
        super(firstName, lastName, birthday, email, phone, PESEL);
        this.region = region;
    }

    public Region getRegion() {
        return region;
    }
    
    public void sendBusToGarage(Bus bus, Garage garage) {
        if (garage.getAcceptedModels().stream().anyMatch(model -> model == bus.getModel())) {
            bus.setGoesTo(garage);
            System.out.println("Bus with registration number " + bus.getRegistrationNumber() + " heads over to garage " + garage.getName());
        } else {
            System.out.println("Given garage doesn't accept the model called " + bus.getModel());
        }
    }

    public void changeRoute(Route route, List<Station> stations, List<List<LocalTime>> arrivalTimes) {
        if (stations.size() != arrivalTimes.size()) {
            System.out.println("Amount of stations and arrival times does not match");
        } else {
            route.getStations().stream().forEach(station -> station.getVisitedBy().remove(route.getRouteNumber()));

            route.setStations(stations);
            route.setArrivalTimes(arrivalTimes);

            route.getStations().stream().forEach(station -> station.getVisitedBy().add(route.getRouteNumber()));

            System.out.println("Route's schedule has changed");
        }
    }

    public void changeRouteNumber(List<Route> routes, Route route, int routeNumber) {
        if (routes.stream().filter(r -> r.getRegion().getId() == route.getRegion().getId()).noneMatch(r -> r.getRouteNumber() == routeNumber)) {
            route.getStations().stream().forEach(station -> station.getVisitedBy().remove(route.getRouteNumber()));

            route.setRouteNumber(routeNumber);

            route.getStations().stream().forEach(station -> station.getVisitedBy().add(route.getRouteNumber()));

            System.out.println("Route's number has changed to " + routeNumber);
        } else {
            System.out.println("A route with given number already exists in this region");
        }
    }
}
