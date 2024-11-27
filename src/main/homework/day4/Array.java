package main.homework.day4;

public class Array {
    public void sumN(int[] array, int n) {
        int sum = 0;
        for (int i = n; i < array.length; i += n) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
    }

    public void moreN(int[] array, int n) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                a++;
            }
        }
        int[] newArray = new int[a];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                newArray[j] = array[i];
                j++;
            }
        }
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void multiN(int[] array) {
        int n = array.length;
        int sum = 0;
        if (n >= 10) {
            n = n / 10;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % n == 0) {
                    sum += array[i];
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % n == 0) {
                    sum += array[i];
                }
            }
        }
        System.out.println("Sum: " + sum);

    }

    public void printPicture() {
        System.out.println("\t  ^__^");
        System.out.println("\t  (oo)\\\\_______");
        System.out.println("\t (__)\\ ) \\/\\  \\");
        System.out.println("\t      ||----w |\\");
        System.out.println("\t      ||     ||");
    }
}
