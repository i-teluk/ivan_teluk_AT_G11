package main.homework.playground.runners;

import main.homework.playground.essence.Flyable;
import main.homework.playground.essence.craft.air.Aircraft;
import main.homework.playground.essence.craft.air.Copter;
import main.homework.playground.essence.craft.air.Plane;
import main.homework.playground.essence.craft.air.Rocket;
import main.homework.playground.essence.creatures.Fly;
import main.homework.playground.essence.creatures.Insect;
import main.homework.playground.essence.creatures.Mosquito;
import main.homework.playground.processors.FlyableProcessor;

public class FlyableProcessorRunner {
    public static void main(String[] args) {
        FlyableProcessor processor = new FlyableProcessor();
        Flyable flyableCopter = new Copter(223, "Mi8 Flyable");
        Flyable flyablePlane = new Plane(3452, "Boeing 837 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Super Heavy Flyable");
        Flyable flyableFly = new Fly(23, "Domestica Flyable");
        Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
        Aircraft aircraftCopter = new Copter(223, "Mi8 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
        Insect insectFly = new Fly(23, "Domestica Insect");
        Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
        Copter aCopter = new Copter(223, "Mi8 Copter");
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        Fly aFly = new Fly(23, "Domestica Fly");
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");

        processor.runFlyable(flyableCopter);
        processor.runFlyable(flyablePlane);
        processor.runFlyable(flyableRocket);
        processor.runFlyable(flyableFly);
        processor.runFlyable(flyableMosquito);
        processor.runFlyable(aircraftCopter);
        processor.runFlyable(aircraftPlane);
        processor.runFlyable(aircraftRocket);
        processor.runFlyable(aCopter);
        processor.runFlyable(aPlane);
        processor.runFlyable(aRocket);
        processor.runFlyable(aFly);
        processor.runFlyable(aMosquito);

        // processor.runFlyable(insectFly);
        // processor.runFlyable(insectMosquito);
        // Метод runFlyable ожидает объект типа Flyable. Объекты такого типа создаются через интерфейс Flyable и родительский класс Aircraft (т.к. он имплементит интерфейс Flyable).
        // Объекты insectFly и insectMosquito созданы через родительские классы, которые не имплементят интерфейс Flyable. Через ссылку типа родительского класса методы интерфейса будут недоступны, даже если они реализованы в дочернем классе
        // Через объект типа дочернего класса доступны все реализованные методы, включая те, которые пришли из интерфейсов.

        processor.runFlyable(flyableCopter, "никуда");
        processor.runFlyable(flyablePlane, "повсюду");

    }
}
