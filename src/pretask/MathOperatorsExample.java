package pretask;

import java.util.Scanner;

public class MathOperatorsExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        int diff = a - b;
        int multi = a * b;
        double quotient = (double) a / b;
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Разность чисел: " + diff);
        System.out.println("Произведение чисел: " + multi);
        System.out.println("Частное чисел: " + quotient);
    }
}
