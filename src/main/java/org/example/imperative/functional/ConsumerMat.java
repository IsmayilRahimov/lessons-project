package org.example.imperative.functional;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.consumer.Person;

import java.util.function.Consumer;

public class ConsumerMat {

    public static void main(String[] args) {

        isNotValid.accept(new Person("A", "V", Gender.MALE));
    }


    static Consumer<Person> isNotValid =
            person -> System.out.println(person.getName() + person.getSurname());
}
