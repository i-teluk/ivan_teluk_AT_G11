package main.java.homework.playground.processors;

import main.java.homework.playground.essence.Flyable;
import main.java.homework.playground.utils.DirectionGenerator;

public class FlyableProcessor {
    public void runFlyable(Flyable flyable) {
        String direction = new DirectionGenerator().generateDirection();
        flyable.flyable(direction);
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.flyable(direction);
    }
}
