package main.java.homework.day6;

public class GenericMethodsInGenericClassTwoParams<M, N> {
    public String genericMethodGenArgs(M object) {
        String str = ("I received 1 arguments of type: " + object.getClass().getSimpleName() + " class");
        return str;
    }

    public String genericMethodGenArgs(M object1, N object2) {
        String str = ("I received 2 arguments of type: " + object1.getClass().getSimpleName() + " class, " + object2.getClass().getSimpleName() + " class");
        return str;
    }

    public void genericMethodHalfGenArgs(M object, String str) {
        String[] strs = str.split("");
        int n = strs.length;
        System.out.println("I got an object of " + object.getClass().getSimpleName() + " class and string with " + n + " characters");
    }

    public void genericMethodHalfGenArgs(M object1, N object2, String str) {
        String[] strs = str.split("");
        int n = strs.length;
        System.out.println("I got an object of " + object1.getClass().getSimpleName() + " class and " + object2.getClass().getSimpleName() + " class and string with " + n + " characters");
    }

}
