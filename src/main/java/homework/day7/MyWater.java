package homework.day7;

import homework.day7.classes.Water;

import java.util.Arrays;
import java.util.List;

public class MyWater {
    public static void main(String[] args) {
        List<Water> waterList = Arrays.asList(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный"));

        for (Water water : waterList) {
            System.out.println(water.getColor() + " - " + water.getSmell());
        }

    }
}
