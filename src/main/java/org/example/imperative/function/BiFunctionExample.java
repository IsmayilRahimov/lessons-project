package org.example.imperative.function;


import java.util.function.BiFunction;

public class BiFunctionExample {


    public static void main(String[] args) {

    }


    static BiFunction<Integer, Integer, Integer> showTime =
            (num1, num2) -> num1 + num2;
}
