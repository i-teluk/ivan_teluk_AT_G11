package main.java.homework.day7;

import java.util.ArrayList;
import java.util.List;

public class Elements {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();

        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();

        int count = 0;
        for (String element : elements) {
            String[] split = element.split("[ -]");
            if (split.length > 1) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();


        elements.add(3, "Spinner");
        elements.remove(1);
        elements.set(4, "Switch");
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
