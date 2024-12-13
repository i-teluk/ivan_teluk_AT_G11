package homework.day5.string;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DateOutput {
    public static void dateOutput(String date) {
        DateTimeFormatter input = DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy");
        LocalDateTime dateInput = LocalDateTime.parse(date, input);
        DateTimeFormatter output = DateTimeFormatter.ofPattern("MMMM, d, yyyy HH:mm", Locale.ENGLISH);
        String dateOutput = dateInput.format(output);
        System.out.println(dateOutput);
    }
}
