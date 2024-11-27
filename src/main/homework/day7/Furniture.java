package main.homework.day7;

import main.homework.day7.classes.Chair;

import java.util.*;

public class Furniture {
    public static void main(String[] args) {
        List<Chair> chairs = Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4));

        for (Chair chair : chairs) {
            System.out.print(chair.getHeight() * chair.getWidth());
            System.out.print(" ");
        }
        System.out.println();

        Map<Integer, Chair> chairMap = new HashMap<>();

        for (int i = 0; i < chairs.size(); i++) {
            chairMap.put(i, chairs.get(i));
        }

        for (Integer key : chairMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        for (Chair chair : chairMap.values()) {
            System.out.println(chair);
        }

        for (Map.Entry<Integer, Chair> set : chairMap.entrySet()) {
            System.out.println(set);
        }
    }
}
