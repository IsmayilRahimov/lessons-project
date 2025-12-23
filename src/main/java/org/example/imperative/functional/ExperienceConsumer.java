package org.example.imperative.functional;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.consumer.Person;

import java.util.List;
import java.util.function.Consumer;

import static org.example.imperative.functional.ConsumerTime.getPerson;

public class ExperienceConsumer {

    public static void main(String[] args) {
        getConsumerPerson.accept(new Person("Samir", "Ehmedov", Gender.MALE));

    }


    static Consumer<Person> getConsumerPerson =
            p -> System.out.println(p.getName() + " " + p.getSurname());
}

