package main.homework.playground.essence.craft.field;

public class Moped extends Vehicle {
    public Moped(int mass, String name) {
        super(mass, name);
    }

    @Override
    public int move(int pointA, int pointB) {
        System.out.println("I am " + getClass().getSimpleName() + ", my name is " + getName() + " and I am moving from point " + pointA + " to point " + pointB);
        return pointB - pointA;
    }
}
