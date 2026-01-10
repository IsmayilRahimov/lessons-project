package org.example.multithreading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AllThread {

    public static void main(String[] args) {
        ExecutorService millionThreadPool = Executors.newFixedThreadPool(1999999999);
        for (int i = 1; i <= 2000000000; i++) {
            int sifarisNomresi = i;
            millionThreadPool.submit(() -> {

                System.out.println(sifarisNomresi + Thread.currentThread().getName());
            });

        }
    }
}
