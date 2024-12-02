package main.homework.day8;

import java.io.*;

public class ReWriteFile {
    public static void main(String[] args) throws IOException {
        ReWriteFile reWriteFile = new ReWriteFile();
        reWriteFile.reWriteMethod();
    }

    public void reWriteMethod() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("output.txt"));

        String stringFromFile = in.readLine();
        in.close();
        String stringFromFileMod = stringFromFile.replaceAll("[AEIOUaeiouАОУЭЫИЯЕЁЮаоуэыияеёю]", "");

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(stringFromFileMod);
            System.out.println("Гласные удалены и файл обновлен.");
        } catch (IOException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
}