package main.java.homework.day6;

import main.java.homework.playground.essence.craft.air.Copter;
import main.java.homework.playground.essence.craft.air.Plane;
import main.java.homework.playground.essence.craft.air.Rocket;
import main.java.homework.playground.essence.craft.field.Car;
import main.java.homework.playground.essence.craft.field.Moped;
import main.java.homework.playground.essence.craft.field.Motorbike;
import main.java.homework.playground.essence.craft.hand.Bottle;
import main.java.homework.playground.essence.craft.hand.Can;
import main.java.homework.playground.essence.craft.hand.Mug;
import main.java.homework.playground.essence.creatures.*;
import main.java.homework.playground.essence.material.Diesel;
import main.java.homework.playground.essence.material.Petrol;
import main.java.homework.playground.essence.material.Water;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> stringGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> integerGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Copter> copterGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plane> planeGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> rocketGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Car> carGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Moped> mopedGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Motorbike> motorbikeGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Bottle> bottleGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Can> canGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mug> mugGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Beetle> beetleGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Carrot> carrotGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Chamomile> chamomileGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crocodile> crocodileGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Fly> flyGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Maylily> maylilyGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mosquito> mosquitoGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pigeon> pigeonGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Potato> potatoGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Radish> radishGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Raven> ravenGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rose> roseGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Diesel> dieselGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Petrol> petrolGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Water> waterGeneric = new GenericMethodsInGenericClassT<>();


        stringGeneric.genericMethodOneGenArg("str ");
        System.out.println(stringGeneric.genericMethodTwoGenArgs("method2", "pam pam"));
        stringGeneric.genericMethodHalfGenArgs("pam pam", "pu pum pum");

        doubleGeneric.genericMethodOneGenArg(45.2);
        System.out.println(doubleGeneric.genericMethodTwoGenArgs(55.2, 321.0));
        doubleGeneric.genericMethodHalfGenArgs(99.324532, "pu pum pum");

        integerGeneric.genericMethodOneGenArg(45);
        System.out.println(integerGeneric.genericMethodTwoGenArgs(55, 321));
        integerGeneric.genericMethodHalfGenArgs(99, "pu pum pum");

        copterGeneric.genericMethodOneGenArg(new Copter(44, "copter"));
        System.out.println(copterGeneric.genericMethodTwoGenArgs(new Copter(44, "copter"), new Copter(44, "copter")));
        copterGeneric.genericMethodHalfGenArgs(new Copter(44, "copter"), "pu pum pum");

        planeGeneric.genericMethodOneGenArg(new Plane(44, "copter"));
        System.out.println(planeGeneric.genericMethodTwoGenArgs(new Plane(44, "copter"), new Plane(44, "copter")));
        planeGeneric.genericMethodHalfGenArgs(new Plane(44, "copter"), "pu pum pum");

        rocketGeneric.genericMethodOneGenArg(new Rocket(44, "copter"));
        System.out.println(rocketGeneric.genericMethodTwoGenArgs(new Rocket(44, "copter"), new Rocket(44, "copter")));
        rocketGeneric.genericMethodHalfGenArgs(new Rocket(44, "copter"), "pu pum pum");

    }
}
