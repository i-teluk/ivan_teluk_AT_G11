package homework.day5.string;

public class FindNumbers {
    public static void findNumbers(String str) {
        String[] numbers = str.split("[\\D+, ]");
        int count = 0;
        for (String number : numbers) {
            if (!number.isEmpty()) {
                count++;
            }
        }
        int[] array = new int[count];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (!numbers[i].isEmpty()) {
                array[j] = Integer.parseInt(numbers[i]);
                j++;
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();


    }
}
