package homework.day1.cycletask;

public class ReadArray {
    public void readArray() {
        CreateArray obj = new CreateArray();
        int[] array = obj.createArray();
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
