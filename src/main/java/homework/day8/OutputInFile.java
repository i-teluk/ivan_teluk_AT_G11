package homework.day8;

import java.io.FileWriter;
import java.util.Scanner;

public class OutputInFile {
    public static void main(String[] args) {
        OutputInFile outputInFile = new OutputInFile();
        outputInFile.outputInFileMethod();
    }

    public void outputInFileMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String input = scanner.nextLine();

        String output = "Hello, I just got " + input + " from you!";

        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            fileWriter.write(output);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}