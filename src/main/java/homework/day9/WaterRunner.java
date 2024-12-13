package homework.day9;

import homework.day7.classes.Water;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {
    public static void main (String[] str) {
        Stream<Water> waterStream = Stream.of(
                new Water("Прозрачная","Нет"),
                new Water("Прозрачная","Нет"),
                new Water("Мутная","Аммиачный"),
                new Water("Синяя","Мятный"));

        System.out.println(waterStream.filter(water -> !(water.getColor().equals("Прозрачная")))
                .sorted(Comparator.comparing(Water::getSmell).reversed())
                .map(water -> new Water(water.getColor(), water.getSmell().replace("ы", "ыы")))
                .map(Water::getSmell)
                .collect(Collectors.joining(""))
                .length());
    }
}