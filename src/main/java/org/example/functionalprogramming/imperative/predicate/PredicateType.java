package org.example.functionalprogramming.imperative.predicate;

import org.example.functionalprogramming.imperative.consumer.Gender;

import java.util.function.Predicate;

public class PredicateType {

    public static void main(String[] args) {
        System.out.println(isShowed("Samir","MUsa"));

        System.out.println(isShowed.test(new Human("Azad", 1980, Gender.MALE, "123")));
    }

    static Boolean isShowed(String strin1, String string2) {
        if (strin1.equals(string2)) {
            return true;
        }
        return false;
    }


    static Predicate<Human> isShowed =
            h -> h.getGender() == Gender.MALE && h.getPhoneNumber().startsWith("+994");
}
