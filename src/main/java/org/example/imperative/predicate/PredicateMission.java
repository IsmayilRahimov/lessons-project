package org.example.imperative.predicate;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.consumer.Person;

import java.util.function.Predicate;

public class PredicateMission {
    public static void main(String[] args) {
        System.out.println(isValid(new Person("Samir", "Suma", Gender.MALE)));
        System.out.println(isValidPredicate.test(new Person("Samir", "Suma", Gender.MALE)));
    }

    static Boolean isValid(Person person) {
        if (person.getName().startsWith("Samir")) {
            return true;
        } else return false;
    }

    static Predicate<Person> isValidPredicate =
            person -> person.getName().startsWith("Samir");

}
