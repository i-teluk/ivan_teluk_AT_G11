package homework.day7;


import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CarsList {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        String[] carsArray = "Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди".split(", ");
        for (String car : carsArray) {
            cars.add(car);
        }

        String fileName = "cars.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String car : cars) {
                writer.write("\"" + car + "\"" + "\n");
            }
            System.out.println("Файл записан");
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < cars.size(); i++) {
            String[] carArray = cars.get(i).split("");
            if (carArray.length > 4) {
                cars.remove(i);
                i--;
            }
        }

        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}
