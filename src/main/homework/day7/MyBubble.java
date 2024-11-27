package main.homework.day7;

import main.homework.day7.classes.Bubble;

import java.util.Arrays;
import java.util.List;

public class MyBubble {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble("CO2", 2), new Bubble("O2", 4), new Bubble("CO", 5));

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }
        System.out.println();

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }
        System.out.println();

        int sumVolume = 0;
        for (Bubble bubble : bubbles) {
            sumVolume += bubble.getVolume();
        }
        System.out.println(sumVolume);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
