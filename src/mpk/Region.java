package mpk;

import java.util.HashSet;
import java.util.Set;

public class Region {
    public Set<Employee> employees;
    public Set<Route> routes;

    private int id;
    private String name;
    private Manager manager;

    public Region(int id, String name, Manager manager) {
        this.id = id;
        this.name = name;
        this.manager = manager;

        employees = new HashSet<Employee>();
        routes = new HashSet<Route>();
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
