package cycletask;

import java.util.Random;

public class CreateArray {
    public int[] createArray() {
        Random rand = new Random();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }
}
