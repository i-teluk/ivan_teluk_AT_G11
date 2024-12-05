package main.homework.day9;

import main.homework.day7.classes.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Stream;

public class PeopleRunner {
    public static void main(String[] str) throws IOException {
        Stream<Person> peopleStream = Stream.of(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша"));

        try (FileWriter fileWriter = new FileWriter("averageAge")) {
            fileWriter.write(String.valueOf("Average age: " +
                    peopleStream.filter(person -> person.getAge() < 60)
                    .sorted(Comparator.comparing(Person::getName))
                    .map(person -> new Person(person.getAge() + 4, person.getName()))
                    .mapToInt(Person::getAge)
                    .average()
                    .orElse(0.0)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}