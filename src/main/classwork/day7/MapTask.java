package main.classwork.day7;

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        String[] strs = "мама мыла раму мыла".split(" ");
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            map.put(i, strs[i]);
        }

        for (int key : map.keySet()) {
            System.out.println(key);
        }

        for (String str : map.values()) {
            System.out.println(str);
        }

        map.entrySet().forEach(System.out::println);


    }
}
