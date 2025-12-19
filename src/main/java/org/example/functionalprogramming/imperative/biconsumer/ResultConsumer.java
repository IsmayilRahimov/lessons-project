package org.example.functionalprogramming.imperative.biconsumer;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.consumer.Person;

public class ResultConsumer {

    public static void main(String[] args) {
        isResult(new Person("Samir", "Rehimov", Gender.MALE), false);

    }


    static String isResult(Person person, Boolean isAccess) {
        if (isAccess) {
            return person.getName() + " " + person.getSurname();
        } else {
            return Gender.MALE.name();
        }
    }
}
