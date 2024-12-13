package homework.playground.processors;

import homework.playground.essence.craft.Rideable;
import homework.playground.utils.DirectionGenerator;

public class RideableProcessor {
    public void runRideable(Rideable rideable) {
        String direction = new DirectionGenerator().generateDirection();
        rideable.drive(direction);
    }

    public void runRideable(Rideable rideable, String direction) {
        rideable.drive(direction);
    }
}