package cycletask;

public class MultiArray {
    public void multiArray(){
        CreateArray obj = new CreateArray();
        int[] array = obj.createArray();
        int multi;
        for (int i = 0; i < array.length; i++) {
            multi = array[i] * 5;
            System.out.print(multi + " ");
        }
        System.out.println();
    }
}
