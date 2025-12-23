package org.example.imperative.functional;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.imperative.Person;

import java.util.function.BiConsumer;

public class BiConusmerCLS {

    public static void main(String[] args) {
        isValidateBoolean.accept(new Person("Samir", "Musa", Gender.MALE), true);
    }


    static BiConsumer<Person, Boolean> isValidateBoolean =
            (person, isValid) -> System.out.println(person.getName().startsWith("Samir") + (isValid ? " is valid" : " is not valid"));
}
