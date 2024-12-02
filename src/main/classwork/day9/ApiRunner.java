package main.classwork.day9;

import java.util.Arrays;
import java.util.List;

public class ApiRunner {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().findFirst().orElse("мама"));

        System.out.println(list.stream().findFirst().filter("мама"::equals).get());

        System.out.println(list.stream().skip(4).findFirst().get());

        List<String> newList = list.stream().skip(3).toList();
        System.out.println(newList);

        List<String> newListTwo = list.stream().filter(x -> x.contains("м")).distinct().toList();
        System.out.println(newListTwo);
    }
}
