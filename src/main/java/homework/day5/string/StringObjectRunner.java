package main.java.homework.day5.string;

public class StringObjectRunner {
    public static void main(String[] args) {
        StringToLetters stringToLetters = new StringToLetters();
        stringToLetters.letter("some");

        Duplicates duplicates = new Duplicates();
        duplicates.duplicates("some, test for some task for some homework");

        FindNumbers findNumbers = new FindNumbers();
        findNumbers.findNumbers("some 888, test for some 1 task for some 2homework");

        NowDate nowDate = new NowDate();
        nowDate.nowDate();
    }
}
