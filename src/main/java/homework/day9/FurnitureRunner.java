package homework.day9;

import homework.day7.classes.Bubble;
import homework.day7.classes.Chair;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FurnitureRunner {
    public static void main(String[] str) {
        Stream<Chair> furnitureStream = Stream.of(
                new Chair(120, 40),
                new Chair(90, 30),
                new Chair(100, 50),
                new Chair(110, 45));

        Random random = new Random();
        int max = furnitureStream.filter(chair -> chair.getHeight() >= 100 && chair.getWidth() <= 50)
                .sorted(Comparator.comparing(Chair::getHeight).thenComparing(Chair::getWidth).reversed())
                .map(chair -> new Chair(chair.getHeight() / 2, chair.getWidth() * random.nextInt(3, 8)))
                .mapToInt(chair -> chair.getHeight() * chair.getWidth())
                .max()
                .orElse(0);

        String[] digitWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        String maxString = "" + max;
        List<String> maxList = Arrays.asList(maxString);
        String name = maxList.stream().flatMap(number -> Stream.of(number.split("")))
                .map(number -> {
                    int num = Integer.parseInt(number);
                    number = digitWords[num];
                    return number;
                })
                .collect(Collectors.joining(" "));
        Bubble bubble = new Bubble(name, max);

        try (FileWriter fileWriter = new FileWriter("bubble.txt")) {
            fileWriter.write(bubble.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
