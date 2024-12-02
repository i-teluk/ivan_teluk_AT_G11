package main.homework.day9;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesRunner {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        butterflies.stream().map(str -> "\"" + str + "\"").filter(
                str -> str.contains("a") && str.contains("o")).forEach(System.out::println);
    }
}