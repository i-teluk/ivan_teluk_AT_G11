package homework.day7;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String butterflie : butterflies) {
            System.out.println("\"" + butterflie + "\"");
        }

        int count = 0;
        for (String butterflie : butterflies) {
            String[] split = butterflie.split("");
            for (int i = 0; i < split.length; i++) {
                if (split[i].equals("o")) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
        System.out.println();

        for (String butterflie : butterflies) {
            System.out.println(butterflie);
        }

    }

}
