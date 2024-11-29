package main.homework.day8;

import java.util.Scanner;

public class SimpleOutput {
    public static void main(String[] args) {
        SimpleOutput simpleOutput = new SimpleOutput();
        simpleOutput.output();
    }

    public void output() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Hello, I just got " + input + " from you!");
    }
}
