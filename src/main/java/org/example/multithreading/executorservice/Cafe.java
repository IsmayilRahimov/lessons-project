package org.example.multithreading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cafe {

    public static void main(String[] args) {

        ExecutorService cafe = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (int i = 1; i <= 100; i++) {
            int sifarisSayi = 1;

            cafe.submit(() -> {
                System.out.println("Sifaris No: "
                        + sifarisSayi +
                        " -hazirlanir" +
                        Thread.currentThread().getName());
            });
        }
        cafe.shutdown();
    }
}
