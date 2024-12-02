package main.homework.playground.essence.craft.air;

import java.io.Serializable;

public class Copter extends Aircraft {
    public Copter(int mass, String name) {
        super(mass, name);
    }

    public Copter() {
        super(23, "Copter");
    }

    @Override
    public void flyable(String direction) {
        System.out.println("I am " + getClass().getSimpleName() + ", my name is " + this.getName() + " and I am flying to " + direction);
    }

    @Override
    public int move(int pointA, int pointB) {
        System.out.println("I am " + getClass().getSimpleName() + ", my name is " + getName() + " and I am moving from point " + pointA + " to point " + pointB);
        return pointB - pointA;
    }
}