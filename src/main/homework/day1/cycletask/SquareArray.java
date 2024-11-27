package main.homework.day1.cycletask;

public class SquareArray {
    public void squareArray(){
        CreateArray obj = new CreateArray();
        int[] array = obj.createArray();
        int square;
        for (int i = 0; i < array.length; i++) {
            square = array[i] * array[i];
            System.out.print(square + " ");
        }
        System.out.println();
    }
}
