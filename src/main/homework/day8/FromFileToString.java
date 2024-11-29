package main.homework.day8;

import java.io.*;

public class FromFileToString {
    public static void main(String[] args) throws ClassNotFoundException {
        FromFileToString fromFileToString = new FromFileToString();
        fromFileToString.fromFileToString();
    }
    public void fromFileToString() throws ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("copter.ser"))) {
            String object = (String) ois.readObject();
            System.out.println("Объект прочитан из файла");
            try (FileWriter fw = new FileWriter("copterString.txt")) {
                fw.write(object);
                System.out.println("Объект записан в новый файл как строка");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
