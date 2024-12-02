package main.homework.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CounterSecond {
    public static void main(String[] args) throws IOException {
        CounterSecond counterSecond = new CounterSecond();
        counterSecond.counterSecondMethod();
    }

    public void counterSecondMethod() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("output.txt"));

        String line;
        String fromFile = "";
        while ((line = in.readLine()) != null) {
            fromFile += line + "\n";
        }
        in.close();

        String count = "Количество символов в файле: " + fromFile.length();

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");

        String newFile = formatter.format(now) + "_" + fromFile.length() + ".txt";

        try (FileWriter fw = new FileWriter(newFile)) {
            fw.write(count);
            System.out.println("Данные записаны в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}