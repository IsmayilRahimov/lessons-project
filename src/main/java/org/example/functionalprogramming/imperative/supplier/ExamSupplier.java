package org.example.functionalprogramming.imperative.supplier;

import java.util.function.Supplier;

public class ExamSupplier {

    public static void main(String[] args) {


        showEs.get();
    }


    static Supplier<String> showEs =
            () -> "Hala Madrid";
}
