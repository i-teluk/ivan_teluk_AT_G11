package people;

public abstract class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Object setAge(int age) {
        this.age = age;
        return null;
    }
}
