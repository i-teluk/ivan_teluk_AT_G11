package main.homework.day5.string;

public class StringToLetters {
    public static void letter(String string) {
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            System.out.println(ch);
        }
    }
}
