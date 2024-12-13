package homework.day7;

import java.util.Arrays;
import java.util.List;

public class Birds {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        String[] vowels = {"а", "у", "о", "и", "э", "ы", "я", "ю", "е", "ё"};
        int count = 0;
        for (String bird : birds) {
            String[] birdArray = bird.split("");
            int countLetters = 0;
            for (String letter : birdArray) {
                if (Arrays.asList(vowels).contains(letter)) {
                    countLetters++;
                }
                if (countLetters > 1) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        birds.set(2, "Синица");

        for (String bird : birds) {
            System.out.print(bird + " ");
        }

    }
}
