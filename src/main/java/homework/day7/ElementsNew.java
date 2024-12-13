package homework.day7;

import java.util.HashMap;
import java.util.Map;

public class ElementsNew {
    public static void main(String[] args) {
        Map<Integer, String> elementsMap = new HashMap<>();

        elementsMap.put(1, "Silicon");
        elementsMap.put(2, "Sulfur");
        elementsMap.put(3, "Argon");
        elementsMap.put(4, "Calcium");
        elementsMap.put(5, "Chromium");
        elementsMap.put(6, "Iron");
        elementsMap.put(7, "Zinc");

        for (String element : elementsMap.values()) {
            System.out.print(element + " ");
        }
        System.out.println();

        int count = 0;
        for (String element : elementsMap.values()) {
           if ( element.contains("u")) {
               count++;
           }
        }
        System.out.println(count);

        for (Map.Entry<Integer, String> entry : elementsMap.entrySet()) {
            System.out.println(entry);
        }

        elementsMap.replace(4, "Selenium");

        elementsMap.remove(2);

        for (Map.Entry<Integer, String> entry : elementsMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
