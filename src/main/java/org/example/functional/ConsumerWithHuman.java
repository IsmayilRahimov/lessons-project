package org.example.functional;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.predicate.Human;

import java.util.function.Consumer;

public class ConsumerWithHuman {


    public static void main(String[] args) {

        humanWithConsumer.accept(new Human("Musa", 14, Gender.MALE, "1"));

    }


    static Consumer<Human> humanWithConsumer =
            h -> h.getName().equals("Musa");


}
