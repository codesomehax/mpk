package mpk;

import java.util.List;

public class Garage extends Building {
    private List<String> acceptedModels;

    public Garage(int id, String name, int[] location, List<String> acceptedModels) {
        super(id, name, location);
        this.acceptedModels = acceptedModels;
    }

    public List<String> getAcceptedModels() {
        return acceptedModels;
    }
    
}
