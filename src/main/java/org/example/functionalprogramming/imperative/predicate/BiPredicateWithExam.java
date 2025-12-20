package org.example.functionalprogramming.imperative.predicate;

import java.util.function.BiPredicate;

public class BiPredicateWithExam {

    public static void main(String[] args) {
        System.out.println(isEqual.test(1, 1));
        System.out.println(isEqual.test(1, 2));
        System.out.println(isMost.test("2", 2));
    }

    static BiPredicate<String, Integer> isMost =

            (yazi1, eded2) -> yazi1.equals(eded2);


    static BiPredicate<Integer, Integer> isEqual =
            Integer::equals;
}
