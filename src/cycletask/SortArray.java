package cycletask;

public class SortArray {
    public void sortArray() {
        CreateArray obj = new CreateArray();
        int[] array = obj.createArray();
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
