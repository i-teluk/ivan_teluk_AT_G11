package main.homework.day9;

import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);

        String[] digitWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        numbersMod.filter(number -> String.valueOf(number).contains("3"))
                .flatMap(number -> Stream.of(String.valueOf(number).split("")))
                .sorted((a,b) -> b.compareTo(a))
                .map(digit -> digitWords[Integer.parseInt(digit)])
                .distinct()
                .forEach(System.out::println);
    }
}