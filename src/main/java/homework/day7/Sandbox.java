package homework.day7;

import homework.day7.classes.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sandbox {
    public static void main(String[] args) {
        List<Sand> sands = new ArrayList<>();

        sands.add(new Sand(2, "Речной"));
        sands.add(new Sand(4, "Речной"));
        sands.add(new Sand(2, "Карьерный"));
        sands.add(new Sand(7, "Речной"));

        for (Sand sand : sands) {
            System.out.print(sand.getWeight() + " ");
        }
        System.out.println();

        for (Sand sand : sands) {
            System.out.print(sand.getName() + " ");
        }
        System.out.println();

        Map<Integer, Sand> map = new HashMap<>();

        for (int i = 0; i < sands.size(); i++) {
            map.put(i, sands.get(i));
        }

        for (Integer key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        for (Sand sand : map.values()) {
            System.out.println(sand);
        }

        map.entrySet().forEach(System.out::println);
    }
}
