package mpk;

public class Building {
    private int id;
    private String name;
    private int[] location; // [x, y]

    public Building(int id, String name, int[] location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
}
