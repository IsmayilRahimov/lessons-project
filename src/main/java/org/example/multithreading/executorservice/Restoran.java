package org.example.multithreading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Restoran {

    public static void main(String[] args) {


        ExecutorService restoran = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (int i = 1; i <= 2000000000; i++) {
            int sifarisNomresi = i;

            restoran.submit(() -> {
                System.out.println("Sifaris" + sifarisNomresi + " hazirlanir (Aspaz:" + Thread.currentThread().getName() + ")");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                System.out.println("Sifaris #" + sifarisNomresi + "  Hazirdir");
                System.out.println("Hazirladi :" + Thread.currentThread().getName() + " Sifaris :" + sifarisNomresi);
            });

        }
        restoran.shutdown();
    }
}
