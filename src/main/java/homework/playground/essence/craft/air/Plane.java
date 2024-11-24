package main.java.homework.playground.essence.craft.air;

public class Plane extends Aircraft {
    public Plane(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void flyable(String direction) {
        System.out.println("I am " + this.getClass().getSimpleName() + ", my name is " + this.getName() + " and I am flying to " + direction);
    }
}
