package main.java.homework.day7;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

public class Figures {
    public static void main(String[] args) {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        String fileName = "figures.txt";
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            int counter = 0;
            for (String figure : figures) {
                fileWriter.write(figure);
                counter++;
                if (counter < figures.size()) {
                    fileWriter.write(" - ");
                }
            }
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (Exception e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }

        int count2 = figures.size();
        for (String figure : figures) {
            String[] figureParts = figure.split("");
            for (int i = 0; i < figureParts.length; i++) {
                if (figureParts[i].equals("и")) {
                    count2--;
                    break;
                }
            }
        }
        System.out.println(count2);

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();

        // try {
        //     figures.add(3, "Треугольник");
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // Arrays.asList создаёт список фиксированного размера. Чтобы вставить новый элемент, необходимо использовать ArrayList, который поддерживает изменение размера списка.

        for (String figure : figures) {
            System.out.print(figure + " ");
        }

    }
}
