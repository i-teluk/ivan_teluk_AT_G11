package homework.day6;

import homework.playground.essence.craft.air.Copter;
import homework.playground.essence.craft.air.Plane;
import homework.playground.essence.craft.air.Rocket;
import homework.playground.essence.craft.field.Car;
import homework.playground.essence.craft.field.Moped;
import homework.playground.essence.craft.field.Motorbike;
import homework.playground.essence.craft.hand.Can;
import homework.playground.essence.craft.hand.Mug;
import homework.playground.essence.creatures.*;
import homework.playground.essence.material.Diesel;
import homework.playground.essence.material.Petrol;
import homework.playground.essence.material.Water;
import project.bubbles.Bottle;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> ssGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> siGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> sdGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> iiGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Copter, Plane> cpGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rocket, Car> rcGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Moped, Motorbike> mmGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Bottle, Can> bcGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mug, Beetle> mbGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Carrot, Chamomile> ccGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Crocodile, Fly> cfGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Maylily, Mosquito> mamoGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Pigeon, Potato> ppGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Radish, Raven> rrGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rose, Diesel> rdGenericMethod = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Petrol, Water> pwGenericMethod = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println (ssGenericMethod.genericMethodGenArgs("some string"));
        System.out.println (ssGenericMethod.genericMethodGenArgs("str1", "str2"));
        ssGenericMethod.genericMethodHalfGenArgs("str1", "str2");
        ssGenericMethod.genericMethodHalfGenArgs("str1", "str2", "str3");

        System.out.println (siGenericMethod.genericMethodGenArgs("some string"));
        System.out.println (siGenericMethod.genericMethodGenArgs("str1", 444));
        siGenericMethod.genericMethodHalfGenArgs("str1", "str2");
        siGenericMethod.genericMethodHalfGenArgs("str1", 5555, "str3");

        System.out.println (sdGenericMethod.genericMethodGenArgs("some string"));
        System.out.println (sdGenericMethod.genericMethodGenArgs("str1", 444.0));
        sdGenericMethod.genericMethodHalfGenArgs("str1", "str2");
        sdGenericMethod.genericMethodHalfGenArgs("str1", 55.55, "str3");

        System.out.println (iiGenericMethod.genericMethodGenArgs(0));
        System.out.println (iiGenericMethod.genericMethodGenArgs(49, 4440));
        iiGenericMethod.genericMethodHalfGenArgs(2, "str2");
        iiGenericMethod.genericMethodHalfGenArgs(24, 55, "str3");

        System.out.println (cpGenericMethod.genericMethodGenArgs(new Copter(99, "cop")));
        System.out.println (cpGenericMethod.genericMethodGenArgs(new Copter(99, "cop"), new Plane(737, "plane")));
        cpGenericMethod.genericMethodHalfGenArgs(new Copter(99, "cop"), "str2");
        cpGenericMethod.genericMethodHalfGenArgs(new Copter(99, "cop"), new Plane(737, "plane"), "str3");
    }
}
