package main.java.classwork.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList2 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
             myList.add("str" + i);
             myList2.add("str" + i);
        }

        long t0 = System.currentTimeMillis();

        for (int i = 0; i < myList.size(); i++) {
            myList.get(i);
        }

        System.out.println(System.currentTimeMillis() - t0);
        t0 = System.currentTimeMillis();

        for (int i = 0; i < myList2.size(); i++) {
            myList2.get(i);
        }

        System.out.println(System.currentTimeMillis() - t0);
    }
}
