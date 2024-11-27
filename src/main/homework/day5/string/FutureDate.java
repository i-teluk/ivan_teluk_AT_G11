package main.homework.day5.string;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FutureDate {
    public static void futureDate(String string) {
        String[] vowels = { "а", "у", "о", "и", "э", "ы", "я", "ю", "е", "ё" };
        string = string.toLowerCase();
        String[] strings = string.split("");
        int n = 0;
        for (int i = 0; i < vowels.length; i++) {
            for (int k = 0; k < strings.length; k++) {
                if (!strings[k].isEmpty()) {
                    if (strings[k].equals(vowels[i])) {
                        n++;
                    }
                }
            }

        }

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM");
        now = now.plusDays(n);
        System.out.println("Сгенерированная гласная дата: " + now.format(formatter));

    }
}
