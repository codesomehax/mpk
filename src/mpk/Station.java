package mpk;

import java.util.HashSet;
import java.util.Set;

public class Station extends Building {
    private Set<Integer> visitedBy;

    public Station(int id, String name, int[] location) {
        super(id, name, location);
        visitedBy = new HashSet<Integer>();
    }

    public Set<Integer> getVisitedBy() {
        return visitedBy;
    }

   
}
