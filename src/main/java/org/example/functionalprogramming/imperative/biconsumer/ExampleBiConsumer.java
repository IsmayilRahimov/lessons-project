package org.example.functionalprogramming.imperative.biconsumer;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.consumer.Person;

import java.util.function.BiConsumer;

public class ExampleBiConsumer {

    public static void main(String[] args) {
        getBiConsumer.accept(new Person("Samir", "Rehimov", Gender.MALE), false);
        getWithPhoneConsumer.accept(new Person("Eli", "Samirov", Gender.MALE), true);
    }


    static BiConsumer<Person, Boolean> getBiConsumer =
            (person, isResult) -> {
                System.out.println(isResult ? person.getName() + " " + person.getSurname() : person.getGender() + "***************");
            };

    static BiConsumer<Person, Boolean> getWithPhoneConsumer =
            (person, isPhone) -> {
                System.out.println(isPhone ? person.getName() + " " + person.getSurname() : person.getGender() + "***************");
            };
}
