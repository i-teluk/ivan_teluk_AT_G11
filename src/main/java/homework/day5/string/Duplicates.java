package main.java.homework.day5.string;

public class Duplicates {
    public static void duplicates(String str) {
        String[] strs = str.split("[, ]");
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                for (int j = i + 1; j < strs.length; j++) {
                    if (strs[j] != null) {
                        if (strs[i].equals(strs[j])) {
                            count++;
                            strs[j] = null;
                        }
                    }
                }
                if (count > 0) {
                    System.out.println("Duplicate word: " + strs[i] + ": " + ++count + " times");
                }
                count = 0;
            }
        }
    }
}
