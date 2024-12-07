package main.homework.playground.processors;

import main.homework.playground.essence.craft.Rideable;
import main.homework.playground.utils.DirectionGenerator;

public class RideableProcessor {
    public void runRideable(Rideable rideable) {
        String direction = new DirectionGenerator().generateDirection();
        rideable.drive(direction);
    }

    public void runRideable(Rideable rideable, String direction) {
        rideable.drive(direction);
    }
}