package homework.day9;

import homework.day7.classes.Bubble;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoublesRunner {
    public static void main(String[] args) {
        Random random = new Random();
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        System.out.println(doubles
                .map(Math::round)
                .map(Long::intValue)
                .flatMap(i -> {
                    return IntStream.range(0, 1)
                            .mapToObj(j -> random.nextInt(i));
                })
                .distinct().flatMap(i -> {
                    Bubble[] bubbles = new Bubble[Integer.valueOf(i.toString())];
                    for (int j = 0; j < bubbles.length; j++) {
                        bubbles[j] = new Bubble("Bubble vol-" + Integer.valueOf(i.toString()), Integer.valueOf(j));
                    }
                    return Arrays.stream(bubbles);
                }).peek(System.out::println).mapToInt(Bubble::getVolume).sum());
    }
}
