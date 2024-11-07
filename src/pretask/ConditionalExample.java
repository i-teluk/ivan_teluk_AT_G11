package pretask;

import java.util.Scanner;

public class ConditionalExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a > 10) {
            System.out.println("Ваше число: " + a + ". Оно больше 10.");
        }
        else {
            System.out.println("Ваше число: " + a + ". Оно меньше 10.");
        }
    }
}
