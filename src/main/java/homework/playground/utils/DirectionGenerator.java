package homework.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {
        int i =(int) ((Math.random() * 39) + 1);
        if (i <= 9) {
            return "NORTH";
        } else if (i <= 19) {
            return "SOUTH";
        } else if (i <= 29) {
            return "WEST";
        } else {
            return "EAST";
        }
    }
}
