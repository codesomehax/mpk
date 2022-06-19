package mpk;

import java.util.HashSet;
import java.util.Set;

public class Region {
    private int id;
    private String name;
    private Manager manager;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Set<Employee> employees;
    public Set<Route> routes;

    public Region(int id, String name, Manager manager) {
        this.id = id;
        this.name = name;
        this.manager = manager;

        employees = new HashSet<Employee>();
        routes = new HashSet<Route>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
