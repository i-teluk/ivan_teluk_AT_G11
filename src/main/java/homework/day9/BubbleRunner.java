package homework.day9;

import homework.day7.classes.Bubble;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BubbleRunner {
    public static void main(String[] str) {
        List<Bubble> bubblesList = Arrays.asList(
                new Bubble("CO2", 2),
                new Bubble("O2", 4),
                new Bubble("CO", 5));


        System.out.println(bubblesList.stream()
                .filter(bubble -> bubble.getVolume() > 3)
                .sorted(Comparator.comparing(bubble -> bubble.getName()))
                .map(bubble -> new Bubble(bubble.getName(), bubble.getVolume()*3))
                .peek(System.out::println)
                .mapToInt(Bubble::getVolume)
                .sum());
    }
}