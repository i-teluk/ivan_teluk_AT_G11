package main.homework.day7;

import main.homework.day7.classes.Cities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CitiesMap {
    public static void main(String[] args) {
        List<Cities> citiesList = new ArrayList<>();

        citiesList.add(new Cities("Москва", 12000000));
        citiesList.add(new Cities("Нью-Йорк", 8400000));
        citiesList.add(new Cities("Париж", 2200000));

        for (Cities cities : citiesList) {
            System.out.print(cities.getName() + " ");
        }
        System.out.println();

        for (Cities population : citiesList) {
            System.out.print(population.getPopulation() + " ");
        }
        System.out.println();

        Map<String, Cities> citiesMap = new HashMap<>();

        for (Cities cities : citiesList) {
            citiesMap.put(cities.getName(), cities);
        }

        int generalPopulation = 0;
        for (Cities cities : citiesMap.values()) {
            generalPopulation += cities.getPopulation();
        }
        System.out.println(generalPopulation);

    }
}
