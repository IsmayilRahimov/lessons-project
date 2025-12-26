package org.example.functional.biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Biconssumer {


    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        map.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });

        apply.accept(1, 2);
    }

    static BiConsumer<Integer, Integer> apply =

            (age1, age2) -> System.out.println(age1 + age2);
}
