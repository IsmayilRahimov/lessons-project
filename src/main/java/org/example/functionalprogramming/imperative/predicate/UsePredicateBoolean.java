package org.example.functionalprogramming.imperative.predicate;

import org.example.functionalprogramming.imperative.consumer.Gender;

import java.util.function.Predicate;

public class UsePredicateBoolean {

    public static void main(String[] args) {
        System.out.println(isShowed.test(new Human("Azad", 1980, Gender.MALE, "123")));

    }


    static Predicate<Human> isShowed =
            human -> human.getGender() == Gender.MALE && human.getPhoneNumber().equals("+994");
}
