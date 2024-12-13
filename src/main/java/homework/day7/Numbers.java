package homework.day7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        int count = 0;
        for (Integer number : numbers) {
            count += number;
        }
        System.out.println("Sum of numbers: " + count);

        numbers.sort(Integer::compareTo);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        numbers.sort(Comparator.<Integer>naturalOrder().reversed());

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
