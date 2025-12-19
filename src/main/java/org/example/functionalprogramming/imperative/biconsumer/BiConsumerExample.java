package org.example.functionalprogramming.imperative.biconsumer;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.consumer.Person;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        getPersonInfo(new Person("Musa", "Aliyev", Gender.MALE), false);
        getPersonInfoWithBiConsumer.accept(new Person("Samir", "Rehimov", Gender.MALE), false);
    }

    static String getPersonInfo(Person person, Boolean isResult) {
        if (isResult) {
            return person.getName() + " " + person.getSurname();
        } else {
            return person.getGender() + "********";
        }
    }

    static BiConsumer<Person, Boolean> getPersonInfoWithBiConsumer =
            (person, isResult) -> {
                System.out.println(isResult ? person.getName() + " " + person.getSurname() : person.getGender() + "");
            };

}
