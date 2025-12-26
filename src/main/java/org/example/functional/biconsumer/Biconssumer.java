package org.example.functional.biconsumer;

import java.util.function.BiConsumer;

public class Biconssumer {


    public static void main(String[] args) {

        apply.accept(1, 2);
    }

    static BiConsumer<Integer, Integer> apply =

            (age1, age2) -> System.out.println(age1 + age2);
}
