package main.java.homework.day1.cycletask;

public class FirstAndLast {
    public void firstAndLast() {
        CreateArray obj = new CreateArray();
        int[] array = obj.createArray();
        int first = array[0];
        int last = array[array.length - 1];
        array[array.length - 1] = first;
        array[0] = last;
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
