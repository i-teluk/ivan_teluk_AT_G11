package homework.day7;

import java.util.Arrays;
import java.util.List;

public class Doubles {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (double d : doubles) {
            System.out.print(d + " ");
        }
        System.out.println();

        double multi = 1;
        for (double d : doubles) {
            multi *= d;
        }
        System.out.println("The product of numbers: " + multi);

        double sum = 0.0;
        for (double d : doubles) {
            int intD = (int) d;
            double doubD = (double) intD;
            double diff = d - doubD;
            sum += diff;
        }
        System.out.println("The sum of fractional parts: " + sum);

        for (int i = 0; i < doubles.size(); i++) {
            int intD = doubles.get(i).intValue();
            System.out.print(intD + " ");
        }
    }
}
