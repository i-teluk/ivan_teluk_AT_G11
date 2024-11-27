package main.homework.day1.pretask;

import java.util.Scanner;

public class SimpleMathExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        int a = input.nextInt();
        System.out.print("Введите ширину прямоугольника: ");
        int b = input.nextInt();
        int square = a * b;
        System.out.println("Площадь прямоугольника: " + square);

    }
}
