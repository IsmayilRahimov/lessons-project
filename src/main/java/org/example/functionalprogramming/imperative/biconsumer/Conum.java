package org.example.functionalprogramming.imperative.biconsumer;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.consumer.Person;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Conum {

    public static void main(String[] args) {


    }


    static BiConsumer<Person, Boolean> getWithPhoneConsumer =
            (person, isBool) -> {
                System.out.println(isBool ? person.getName() + " " + person.getSurname() : Gender.MALE + " " + person.getName());
            };

    static Consumer<Person> getConsumerWithF = person -> {
        System.out.println(person.getName() + " " + person.getSurname());
    };

}
