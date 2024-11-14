package main.java.homework.day5.playground.essence.creatures;

public class Beetle extends Insect {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot carrot) {
        if (carrot.getMass() > mass) {
            int D = carrot.getMass() / mass;
            String nestBeetle = String.format("I am %s and I will nest there with %d my family members!", name, D);
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }

}
