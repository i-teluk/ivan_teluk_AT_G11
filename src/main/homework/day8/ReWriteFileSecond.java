package main.homework.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReWriteFileSecond {
    public static void main(String[] args) throws IOException {
        ReWriteFileSecond reWriteFileSecond = new ReWriteFileSecond();
        reWriteFileSecond.reWrite();
    }

    public void reWrite() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("output.txt"));

        String stringFromFile = in.readLine();
        in.close();
        String stringFromFileMod = stringFromFile.replaceAll("[^AEIOUaeiouАОУЭЫИЯЕЁЮаоуэыияеёю\\n\\s]", "");

        try (FileWriter writer = new FileWriter("output.txt", true)) {
            writer.write(System.lineSeparator() + stringFromFileMod);
            System.out.println("Согласные удалены и файл обновлен.");
        } catch (IOException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
