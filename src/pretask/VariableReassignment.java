package pretask;

import java.util.Scanner;

public class VariableReassignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Первое число: " + a);
        a = input.nextInt();
        System.out.println("Второе число: " + a);
    }
}
