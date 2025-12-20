package org.example.functionalprogramming.imperative.function;

import java.util.function.Function;

public class ExamFunction {

    public static void main(String[] args) {
        System.out.println(showInt(5));
        System.out.println(withFunction.andThen(multipWithFunction).apply(15));
    }

    static int showInt(int number) {
        return number + 5;
    }


    static Function<Integer, Integer> withFunction =
            number -> number + 5;


    static Function<Integer, Integer> multipWithFunction =
            number -> number * 5;
}
