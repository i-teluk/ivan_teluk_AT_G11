package main.homework.playground.essence.creatures;

import main.homework.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {
    public Fly(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void flyable(String direction) {
        System.out.println("I am " + this.getClass().getSimpleName() + ", my name is " + this.getName() + " and I am flying to " + direction);
    }
}
