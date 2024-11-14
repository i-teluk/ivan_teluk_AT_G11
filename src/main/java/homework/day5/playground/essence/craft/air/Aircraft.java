package main.java.homework.day5.playground.essence.craft.air;

import main.java.homework.day5.playground.essence.Flyable;
import main.java.homework.day5.playground.essence.Matter;
import main.java.homework.day5.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {
    protected String name;

    public Aircraft(int mass, String name) {
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
