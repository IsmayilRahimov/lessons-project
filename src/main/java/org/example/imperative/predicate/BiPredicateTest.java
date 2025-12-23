package org.example.imperative.predicate;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.imperative.Person;

import java.util.function.BiPredicate;

public class BiPredicateTest {


    public static void main(String[] args) {
        System.out.println(isNotValid.test("Samir", new Person("ALi", "Vaiqd", Gender.MALE)));
    }


    static BiPredicate<String, Person> isNotValid =
            (name2, person) -> name2.equals(person.getName());
}
