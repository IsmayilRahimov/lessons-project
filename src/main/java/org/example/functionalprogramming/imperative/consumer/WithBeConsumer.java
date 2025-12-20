package org.example.functionalprogramming.imperative.consumer;

import org.example.functionalprogramming.imperative.predicate.Human;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class WithBeConsumer {


    public static void main(String[] args) {
        getConsumerWithF.accept(new Person("Samir", "Aleva", Gender.MALE));
        equalShow.accept(new Human("Murad", 1992, Gender.MALE, "994"), 1992);

    }

    static Consumer<Person> getConsumerWithF =
            person -> {
                System.out.println(person.getName() + " " + person.getSurname());

            };


    static BiConsumer<Human, Integer> equalShow =
            (human, minAge) -> {
                if (human.getYear() < minAge) {
                    System.out.println("<UNK>");
                }
            };
}
