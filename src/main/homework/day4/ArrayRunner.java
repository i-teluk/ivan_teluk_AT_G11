package main.homework.day4;

public class ArrayRunner {
    public static void main(String[] args) {
        Array array = new Array();
        array.sumN(new int[]{2, 4, 4, 6, 2, 8, 9, 2, 6, 4, 0}, 2);
        array.moreN(new int[]{2, 4, 4, 6, 2, 8, 9, 2, 6, 4, 0}, 5);
        array.multiN(new int[]{5,3,7,44,2,1,67,8,5,44,67,3,22,22,98,7,6,53,3,2,2,56,43,77,0,8,44});
        array.printPicture();
    }
}
