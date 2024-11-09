package cycletask;

public class ReadArrayFromEnd {
    public void readArrayFromEnd() {
        CreateArray obj = new CreateArray();
        int[] array = obj.createArray();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print((array[i]) + " ");
        }
        System.out.println();
    }
}
