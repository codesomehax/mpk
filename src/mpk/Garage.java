package mpk;

public class Garage extends Building {
    private String[] acceptedModels;

    public Garage(int id, String name, int[] location, String[] acceptedModels) {
        super(id, name, location);
        this.acceptedModels = acceptedModels;
    }
    
}
