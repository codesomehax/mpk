package mpk;

public class Bus {
    private String registrationNumber;
    private String model;
    private int year;
    private int[] currentLocation;
    private Building goesTo;
    private int currentStationIndex;
    private Route currentRoute;
    

    public Bus(String registrationNumber, String model, int year, int[] currentLocation, Route currentRoute) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.year = year;
        this.currentLocation = currentLocation;

        if (currentRoute == null) {
            this.goesTo = null;
            this.currentStationIndex = -1;
        } else {
            this.currentRoute = currentRoute;
            this.goesTo = currentRoute.getStations().get(0);
            this.currentStationIndex = 0;
        }

    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int[] getCurrentLocation() {
        return currentLocation;
    }

    public Building getGoesTo() {
        return goesTo;
    }

    public void setGoesTo(Building goesTo) {
        this.goesTo = goesTo;
    }

    public void arriveAt(Building building) {
        if (building instanceof Station) {
            currentStationIndex = (currentStationIndex + 1) % currentRoute.getStations().size();
            goesTo = currentRoute.getStations().get(currentStationIndex);
        } else if (building instanceof Garage) {
            currentStationIndex = -1;
            goesTo = null;
            currentRoute = null;
        }
    }

    // public Garage findClosestAcceptableGarage(Garage[] garages) {
    //     List<Garage> acceptingGarages = Arrays.stream(garages).filter(
    //         garage -> Arrays.stream(garage.getAcceptedModels()).anyMatch(acceptedModel -> acceptedModel == model)
    //     ).toList();

        
    // }

    // public double distanceToBulding(Building building) {
    //     return Math.sqrt(
    //         Math.pow(currentLocation[0] - building.getLocation()[0], 2) +
    //         Math.pow(currentLocation[1] - building.getLocation()[1], 2)
    //     );
    // }
}
