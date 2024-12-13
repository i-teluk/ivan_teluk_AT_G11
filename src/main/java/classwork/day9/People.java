package classwork.day9;

import java.util.Arrays;
import java.util.List;

public class People {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        int count = 0;
        for (Person person : people) {
            if (person.sex == Person.Sex.MAN && person.age < 60 && person.age >= 18) {
                    count++;
            } else if (person.sex == Person.Sex.WOMEN && person.age < 55 && person.age >= 18) {
                    count++;
            }
        }
        System.out.println(count);

        long count2 = 0;
        count2 = people.stream().filter(person -> (person.sex == Person.Sex.MAN && person.age < 60 && person.age >= 18)
                                                || (person.sex == Person.Sex.WOMEN && person.age < 55 && person.age >= 18)).count();
        System.out.println(count2);
    }
}
