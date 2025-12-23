package org.example.imperative.predicate;

import java.util.function.BiPredicate;

public class BiPredicateLanc {


    public static void main(String[] args) {
        System.out.println(notValid.test("Samir", "Musa"));

    }


    static Boolean isValid(String name, String name2) {
        if (name.equals(name2)) {
            return true;
        } else return false;
    }


    static BiPredicate<String, String> notValid =
            (name1, name2) -> name1.equals(name2);
}
