package main.homework.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Counter {
    public static void main(String[] args) throws IOException {
        Counter counter = new Counter();
        counter.counter();
    }

    public void counter() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("output.txt"));

        String line;
        String fromFile = "";
        while ((line = in.readLine()) != null) {
            fromFile += line + "\n";
        }
        in.close();

        System.out.println("Количество символов в файле: " + fromFile.length());
    }
}
