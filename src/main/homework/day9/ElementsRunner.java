package main.homework.day9;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Stream<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");
        elements.map(element -> {
            int index = atomicInteger.getAndIncrement();
            if (index % 2 != 0) {
                return element.replace("e", "o");
            } else {
                return String.valueOf(element.length());
            }
        }).distinct().forEach(System.out::println);
    }
}