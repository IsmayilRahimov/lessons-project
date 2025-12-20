package org.example.functionalprogramming.imperative.predicate;

import org.example.functionalprogramming.imperative.consumer.Gender;

public class HumanEquals {

    public static void main(String[] args) {
        System.out.println((new Human("Azad", 1980, Gender.MALE, "+99422")));

    }

    static Boolean isShowed(Human human) {

        if (human.getPhoneNumber().startsWith("+994") && human.getYear() == 1980) {
            return true;
        } else {
            return false;
        }

    }
}
