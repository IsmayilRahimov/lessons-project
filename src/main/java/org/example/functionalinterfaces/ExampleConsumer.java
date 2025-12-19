package org.example.functionalinterfaces;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.consumer.Person;

import java.util.function.Consumer;

public class ExampleConsumer {

    public static void main(String[] args) {
        String result = getPerson(new Person("Ali", "Ragimov", Gender.MALE));
        System.out.println(result);
        getPersonWithConsumer.accept(new Person("Ali", "Ragimov", Gender.MALE));
        getPerson(new Person("Anar", "Ceferov", Gender.MALE));
    }

    static String getPerson(Person person) {
        return person.getName() + person.getSurname() + person.getGender();
    }

    static Consumer<Person> getPersonWithConsumer =
            person -> System.out.println(person.getName() + " " + person.getSurname() + " " + person.getGender());
}
