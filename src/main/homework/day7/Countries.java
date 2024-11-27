package main.homework.day7;

import java.util.ArrayList;
import java.util.List;

public class Countries {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String country : countries) {
            System.out.print(country);
            if (!countries.get(countries.size() - 1).equals(country)) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int count = 0;
        for (String country : countries) {
            String[] split = country.split("");
            if (split.length < 7) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
