package org.example.functionalinterfaces;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.consumer.Person;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        getPersonWithConsumer.accept(new Person("Ali","Ragimov",Gender.MALE));
        getPerson(new Person("Huseyn", "Ahmadov", Gender.MALE));
    }


    static String getPerson(Person person) {
        return person.getName() + person.getSurname() + person.getGender();
    }

    static Consumer<Person> getPersonWithConsumer =
            person -> System.out.println(person.getName() + " " + person.getSurname() + " " + person.getGender());
}
