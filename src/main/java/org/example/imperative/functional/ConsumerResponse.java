package org.example.imperative.functional;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.imperative.Person;

import java.util.function.Consumer;

public class ConsumerResponse {


    public static void main(String[] args) {
withConsumer.accept(new Person("Samir", "Ehmedov", Gender.MALE));

    }


    static Consumer<Person> withConsumer =
            person -> System.out.println(person.getName() + ", " + person.getGender());
}
