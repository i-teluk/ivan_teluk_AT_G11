package main.homework.playground.processors;

import main.homework.playground.essence.craft.Transportable;
import main.homework.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int i = transportable.move(pointA, pointB);
        System.out.println("Transportable " + transportable.getClass().getSimpleName() + " was moved to " + i + " points");
    }

    public void runTransportable(Transportable transportable) {
        int i = transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate());
        System.out.println("Transportable " + transportable.getClass().getSimpleName() + " was moved to " + i + " points");
    }
}
