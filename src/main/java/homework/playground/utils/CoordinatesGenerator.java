package homework.playground.utils;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        int i =(int) ((Math.random() * 79) + 1);
        System.out.println("CoordinatesGenerator: I have generated point with value: " + i);
        return i;
    }
}