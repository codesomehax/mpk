package mpk;

import java.util.HashSet;

public class Station extends Building {
    private HashSet<Integer> visitedBy;

    public Station(int id, String name, int[] location) {
        super(id, name, location);
        visitedBy = new HashSet<Integer>();
    }

   
}
