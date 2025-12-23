package org.example.imperative.functional;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.imperative.Person;

import java.util.function.BiConsumer;

public class BiConsumerTime {

    public static void main(String[] args) {
isValidateBoolean.accept(new Person("Samir","Musa", Gender.MALE),true);

    }

    static BiConsumer<Person, Boolean> isValidateBoolean =
            (person, isExpired) -> System.out.println(isExpired ? person.getName() + person.getSurname() : person.getName() + person.getGender());

}
