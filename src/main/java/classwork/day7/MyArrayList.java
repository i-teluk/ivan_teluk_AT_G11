package main.java.classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        String str = "мама мыла раму мыла";
        String[] strs = str.split(" ");
        List<String> list = new ArrayList<>();
        // for (String str1 : strs) {
        //     list.add(str1);
        // }

        for (int i = 0; i < strs.length; i++) {
            list.add(strs[i]);
        }

        // for (String str2 : list) {
        //     System.out.println(str2);
        // }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
