package main.homework.day9;

import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {
        Stream<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия");
        countries.filter(country -> country.matches(".*[АОУЭЫИЯЕЁЮаоуэыияеёю].*") && country.length() < 7)
                .map(String::toUpperCase)
                .map(country -> "\"" + country + "\"")
                .forEach(System.out::println);
    }
}