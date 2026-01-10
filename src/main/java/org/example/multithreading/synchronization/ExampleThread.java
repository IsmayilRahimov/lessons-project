package org.example.multithreading.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExampleThread {

    public static void main(String[] args) {

        ExecutorService restoran = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            int sifarisNomresi = i;
            restoran.submit(() -> {
                System.out.println("Sifaris " + sifarisNomresi
                        + " hazirlanir(Aspaz: " + Thread.currentThread().getName() + ")");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }
                System.out.println("Sifaris " + sifarisNomresi + ": hazirdir!");
            });
        }
        restoran.shutdown();
    }
}
