package main.homework.playground.essence.creatures;

public abstract class Vertebrata extends  Animal {
    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    public void eat(Insect insect) {
        String vertebrataEat = String.format("I am %s and I am eating %s", this.getName(), insect.getName());
    }
}