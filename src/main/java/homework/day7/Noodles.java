package homework.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Noodles {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hakka");
        list.add("Ramen");
        list.add("Hibachi");
        list.add("Schezwan");

        for (String s : list) {
            System.out.print(s);
            if (!s.equals(list.get(list.size() - 1))) {
                System.out.print(" - ");
            }
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("a")) {
                list.set(i, list.get(i).replaceAll("a", "o"));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
