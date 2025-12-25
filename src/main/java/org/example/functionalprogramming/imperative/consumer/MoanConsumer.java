package org.example.functionalprogramming.imperative.consumer;

import org.example.functionalprogramming.imperative.predicate.Human;

import java.util.function.Consumer;

public class MoanConsumer {


    public static void main(String[] args) {
        showTime.accept(new Human("Ali", 1996, Gender.MALE, "99"));
    }


    static Consumer<Human> showTime =
            h -> h.setName("Samir");
}
