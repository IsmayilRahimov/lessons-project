package org.example.imperative.predicate;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.imperative.Person;

import java.util.function.Predicate;

public class PredicateLe {


    public static void main(String[] args) {

        System.out.println(argValid.test(new Person("Samir", "Suma", Gender.MALE)));
    }



    static Predicate<Person> argValid =
            person -> person.getName().equals("Samir") && person.getGender() == Gender.MALE;
}
