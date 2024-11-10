package main.java.homework.day1.pretask;

import java.util.Scanner;

public class SimpleLoopExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 1; i < a; i++) {
            System.out.println(i);
        }
    }
}
