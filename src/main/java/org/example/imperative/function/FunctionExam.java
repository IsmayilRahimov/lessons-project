package org.example.imperative.function;

import java.util.function.Function;

public class FunctionExam {
    public static void main(String[] args) {
        ageOf(10);
        showFunction.apply(10);
        showFunction.apply(10);
    }


    static void ageOf(int number) {
        number = number + 1;
        System.out.println(number);
    }


    static Function<Integer, Integer> showFunction =

            number -> number + 1;

}
