package main.java.homework.playground.essence.craft.field;

import main.java.homework.playground.essence.Matter;
import main.java.homework.playground.essence.craft.Rideable;
import main.java.homework.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Rideable, Transportable {
    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
