package org.example.functionalinterfaces;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.consumer.Person;

import java.util.function.Consumer;

public class AndTehnConsumer {
    public static void main(String[] args) {
        getPersonNameWithConsumer().andThen(getPersonSurnameWithConsumer).andThen(getPersonGenderWithConsumer).accept(new Person("Ali", "Ragimov", Gender.MALE));
    }

    static Consumer<Person> getPersonNameWithConsumer() {
        return person -> System.out.println(person.getName());
    }

    static Consumer<Person> getPersonSurnameWithConsumer =
            person -> System.out.println(person.getSurname());

    static Consumer<Person> getPersonGenderWithConsumer =
            person -> System.out.println(person.getGender());
}


