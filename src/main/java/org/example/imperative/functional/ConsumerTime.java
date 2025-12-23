package org.example.imperative.functional;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.imperative.Person;

import java.util.function.Consumer;

public class ConsumerTime {


    public static void main(String[] args) {
        getPersonConsumer.accept(new Person("Samir", "Eliyev", Gender.MALE));
        getPerson(new Person("Samir", "Ehmedov", Gender.MALE));
    }


    static String getPerson(Person person) {
        return person.getName();
    }


    static Consumer<Person> getPersonConsumer =
            person -> System.out.println(person.getName() + ", " + person.getGender());
}
