package main.homework.playground.essence.craft.air;

import main.homework.playground.essence.Flyable;
import main.homework.playground.essence.Matter;
import main.homework.playground.essence.craft.Transportable;

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
