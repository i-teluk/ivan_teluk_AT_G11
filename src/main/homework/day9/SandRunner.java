package main.homework.day9;

import main.homework.day7.classes.Sand;

import java.io.FileWriter;
import java.util.*;

public class SandRunner {
    public static void main(String[] str) {
        List<Sand> sandList = new ArrayList<>();
        sandList.add(new Sand(12, "Речной"));
        sandList.add(new Sand(8, "Речной"));
        sandList.add(new Sand(15, "Речной"));
        sandList.add(new Sand(7, "Речной"));
        sandList.add(new Sand(11, "Речной"));

        Map<Integer, String> sandMap = new HashMap<>();
        sandList.stream().filter(sand -> sand.getWeight() > 9 && sand.getName().contains("ч"))
                .sorted(Comparator.comparing(Sand::getWeight))
                .map(sand -> new Sand(sand.getWeight() * 2, sand.getName().toUpperCase()))
                .peek(sand -> {
                    sandMap.put(sand.getWeight(), sand.getName());
                })
                .forEach(sand -> {
                });

        try (FileWriter fileWriter = new FileWriter("sandMap.txt")) {
            for (Map.Entry<Integer, String> entry : sandMap.entrySet()) {
                fileWriter.write(entry.getValue() + ":" + entry.getKey() + "\n");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}