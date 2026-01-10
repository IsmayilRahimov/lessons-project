package org.example.multithreading.synchronization;

public class MainSynchorinizade {

    public static void main(String[] args) {

        Sleep sleep = new Sleep();

        Thread thread1 = new Thread(() -> {
            sleep.show("Ismayil");
        });

        Thread thread2 = new Thread(() -> {
            sleep.show("Paul");
        });

        thread1.start();
        thread2.start();

    }
}
