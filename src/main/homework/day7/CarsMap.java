package main.homework.day7;

import main.homework.day7.classes.Cars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarsMap {
    public static void main(String[] args) {
        List<Cars> carsList = new ArrayList<>();

        carsList.add(new Cars("Toyota", "Corolla"));
        carsList.add(new Cars("Ford", "Mustang"));
        carsList.add(new Cars("BMW", "X5"));

        for (Cars car : carsList) {
            System.out.println(car.getBrand() + " : " + car.getModel());
        }

        Map<String, Cars> carsMap = new HashMap<>();

        for (Cars car : carsList) {
            carsMap.put(car.getBrand(), car);
        }

        for (String brand : carsMap.keySet()) {
            System.out.println(brand);
        }

        for (Cars car : carsMap.values()) {
            System.out.println(car);
        }

        for (Map.Entry<String, Cars> entry : carsMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
