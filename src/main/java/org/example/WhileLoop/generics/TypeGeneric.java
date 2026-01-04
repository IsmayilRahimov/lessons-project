package org.example.WhileLoop.generics;

import java.time.LocalDateTime;

public class TypeGeneric<T> {

    static <T> void show() {
        System.out.println(LocalDateTime.now());
    }

    static <T> void show(T t) {
        System.out.println(LocalDateTime.now());
    }
}
