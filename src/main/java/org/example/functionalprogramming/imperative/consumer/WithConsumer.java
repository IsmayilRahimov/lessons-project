package org.example.functionalprogramming.imperative.consumer;

import org.example.functionalprogramming.imperative.predicate.Human;

import java.util.function.Consumer;

public class WithConsumer {

    public static void main(String[] args) {

    }

    static Consumer<Human> isEquals =
            h -> System.out.println(h.getPhoneNumber().startsWith("123"));

}
