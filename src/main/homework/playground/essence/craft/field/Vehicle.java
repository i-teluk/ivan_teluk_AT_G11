package main.homework.playground.essence.craft.field;

import main.homework.playground.essence.Matter;
import main.homework.playground.essence.craft.Rideable;
import main.homework.playground.essence.craft.Transportable;

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

    @Override
    public void drive(String direction) {

    }

    @Override
    public int move(int pointA, int pointB) {
        return 0;
    }
}