package main.java.homework.playground.runners;

import main.java.homework.playground.essence.Flyable;
import main.java.homework.playground.essence.craft.Rideable;
import main.java.homework.playground.essence.craft.Transportable;
import main.java.homework.playground.essence.craft.air.Aircraft;
import main.java.homework.playground.essence.craft.air.Copter;
import main.java.homework.playground.essence.craft.air.Plane;
import main.java.homework.playground.essence.craft.air.Rocket;
import main.java.homework.playground.essence.craft.field.Car;
import main.java.homework.playground.essence.craft.field.Moped;
import main.java.homework.playground.essence.craft.field.Motorbike;
import main.java.homework.playground.essence.craft.field.Vehicle;
import main.java.homework.playground.processors.TransportableProcessor;

public class TransportableProcessorRunner {
    public static void main(String[] args) {
        TransportableProcessor processor = new TransportableProcessor();

        Transportable transportableCopter = new Copter(223, "AW109 Transportable");
        Transportable transportablePlane = new Plane(3452, "Airbus a380 Transportable");
        Transportable transportableRocket = new Rocket(7623, "Soyuz-FG Transportable");
        Transportable transportableCar = new Car(23, "Tesla X Transportable");
        Transportable transportableMoped = new Moped(12, "Honda EM1 Transportable");
        Transportable transportableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Transportable");
        Aircraft aircraftCopter = new Copter(223, "AW109 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Airbus a380 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Soyuz-FG Aircraft");
        Vehicle vehicleCar = new Car(23, "Tesla X Vehicle");
        Vehicle vehicleMoped = new Moped(12, "Honda EM1 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Vehicle");
        Flyable flyableCopter = new Copter(223, "AW109 Flyable");
        Flyable flyablePlane = new Plane(3452, "Airbus a380 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Soyuz-FG Flyable");
        Rideable rideableCar = new Car(23, "Tesla X Rideable");
        Rideable rideableMoped = new Moped(12, "Honda EM1 Rideable");
        Rideable rideableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Rideable");
        Copter aCopter = new Copter(223, "AW109 Copter");
        Plane aPlane = new Plane(3452, "Airbus a380 Plane");
        Rocket aRocket = new Rocket(7623, "Soyuz-FG Rocket");
        Car aCar = new Car(23, "Tesla X Car");
        Moped aMoped = new Moped(12, "Honda EM1 Moped");
        Motorbike aMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Motorbike");

        processor.runTransportable(transportableCopter);
        processor.runTransportable(transportablePlane);
        processor.runTransportable(transportableRocket);
        processor.runTransportable(transportableCar);
        processor.runTransportable(transportableMoped);
        processor.runTransportable(transportableMotorbike);
        processor.runTransportable(aircraftCopter);
        processor.runTransportable(aircraftPlane);
        processor.runTransportable(aircraftRocket);
        processor.runTransportable(vehicleCar);
        processor.runTransportable(vehicleMoped);
        processor.runTransportable(vehicleMotorbike);
        processor.runTransportable(aCopter);
        processor.runTransportable(aPlane);
        processor.runTransportable(aRocket);
        processor.runTransportable(aCar);
        processor.runTransportable(aMoped);
        processor.runTransportable(aMotorbike);

        // processor.runTransportable(flyableCopter);
        // processor.runTransportable(flyablePlane);
        // processor.runTransportable(flyableRocket);
        // processor.runTransportable(rideableCar);
        // processor.runTransportable(rideableMoped);
        // processor.runTransportable(rideableMotorbike);
        // Эти объекты были созданы через другие интерфейсы, не Transportable.

        processor.runTransportable(transportableCopter, 23, 242);
        processor.runTransportable(transportablePlane, 93, 7);
    }
}
