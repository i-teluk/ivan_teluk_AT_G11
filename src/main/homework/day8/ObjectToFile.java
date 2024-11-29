package main.homework.day8;

import main.homework.playground.essence.craft.air.Copter;

import java.io.*;

public class ObjectToFile {
    public static void main(String[] args) {
        ObjectToFile objectToFile = new ObjectToFile();
        objectToFile.objectToFile();
    }

    public void objectToFile() {
        Copter copter = new Copter(45, "Mi8");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("copter.ser"))) {
            oos.writeObject(copter);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
