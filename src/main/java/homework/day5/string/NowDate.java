package main.java.homework.day5.string;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NowDate {
    public static void nowDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM, yyyy, H 'часа' m 'минут'");

        System.out.println("Сейчас на дворе: " + now.format(formatter));
    }
}
