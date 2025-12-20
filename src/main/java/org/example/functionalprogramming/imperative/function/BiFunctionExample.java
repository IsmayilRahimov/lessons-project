package org.example.functionalprogramming.imperative.function;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {
        System.out.println(incrementByOne(4, 5));
        System.out.println(biFunction.apply(5, 6));
        System.out.println(concatString.apply("Salam ","Necesen"));
    }


    static int incrementByOne(int number, int multiple) {
        return (number + 5) * multiple;
    }

    static BiFunction<String, String, String> concatString =
            (string1, string2) -> string1.concat(string2);


    static BiFunction<Integer, Integer, Integer> biFunction =
            (num, multi) -> (num + 5) * multi;
}
