package homework.day7;

import java.util.ArrayList;
import java.util.List;

public class СitiesList {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String city : cities) {
            System.out.println(city);
        }

        int count = 0;
        for (String city : cities) {
            String[] split = city.split("");
            for (int i = 0; i < split.length; i++ ) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
