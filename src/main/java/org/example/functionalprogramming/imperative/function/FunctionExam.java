package org.example.functionalprogramming.imperative.function;

import java.util.function.Function;

public class FunctionExam {

    public static void main(String[] args) {
        System.out.println(incrementByFunction.andThen(incrementBy5WithFunction).apply(15));
    }

//    static int incrementByOne(int number) {
//        return ++number;
//    }

    static Integer incrementByOne(Integer number) {
        return number + 2;
    }

    static Function<Integer, Integer> incrementBy5WithFunction =
            number -> number * 5;

    static Function<Integer, Integer> incrementByFunction =
            number -> number + 1;
}
