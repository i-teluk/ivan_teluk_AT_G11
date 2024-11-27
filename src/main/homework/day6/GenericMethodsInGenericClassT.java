package main.homework.day6;

public class GenericMethodsInGenericClassT<T> {
    public void genericMethodOneGenArg(T object) {
        System.out.println("I am an object of " + object.getClass().getSimpleName() + " class");
    }

    public String genericMethodTwoGenArgs(T object1, T object2) {
        String string = ("We are objects of " + object1.getClass().getSimpleName() + " class and " + object2.getClass().getSimpleName() +" class");
        return string;
    }

    public void genericMethodHalfGenArgs(T object, String str) {
        String[] strings = str.split("");
        int n = strings.length;
        System.out.println("I got an object of " + object.getClass().getSimpleName() + " class and string with " + n + " characters");
    }
}
