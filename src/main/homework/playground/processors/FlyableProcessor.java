package main.homework.playground.processors;

import main.homework.playground.essence.Flyable;
import main.homework.playground.utils.DirectionGenerator;

public class FlyableProcessor {
    public void runFlyable(Flyable flyable) {
        String direction = new DirectionGenerator().generateDirection();
        flyable.flyable(direction);
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.flyable(direction);
    }
}
