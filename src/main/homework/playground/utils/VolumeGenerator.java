package main.homework.playground.utils;

import main.homework.playground.essence.material.Pourable;

public class VolumeGenerator {
    public static int generateVolume(Pourable pourable) {
        int i;
        if (pourable.getClass().getSimpleName().equals("Petrol") || pourable.getClass().getSimpleName().equals("Diesel") ) {
            i =(int) ((Math.random() * 49) + 1);
        } else if (pourable.getClass().getSimpleName().equals("Water")) {
            i =(int) ((Math.random() * 50) + 50);
        } else {
            throw new IllegalArgumentException("Unsupported pourable type: " + pourable.getClass().getSimpleName());
        }
        System.out.printf("VolumeGenerator: I have generated volume of %s with value: %s\n", pourable.getClass().getSimpleName(), i);
        return i;
    }
}
