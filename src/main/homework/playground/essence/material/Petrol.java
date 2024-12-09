package main.homework.playground.essence.material;

import main.homework.playground.essence.Matter;

public class Petrol extends Matter implements Pourable, Powerable {

    public Petrol(int mass) {
        super(mass);
    }

    @Override
    public void spread(String storeName) {
        System.out.printf("I am %s and I am spreading in %s\n", getClass().getSimpleName(), storeName);
        System.out.println("wheeh..");
    }
}
