package main.java.homework.day1.cycletask;

public class MinArray {
    public void minArray() {
        CreateArray obj = new CreateArray();
        int[] array = obj.createArray();
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
