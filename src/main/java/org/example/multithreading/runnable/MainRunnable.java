package org.example.multithreading.runnable;

public class MainRunnable {


    public static void main(String[] args) {
        Thread thread1 = new Thread(new ChiefCakes("TORT"));
        Thread thread2 = new Thread(new ChiefCakes("Biscuviet"));
        Thread thread3 = new Thread(new ChiefCakes("Cakek"));
        Thread thread4 = new Thread(new ChiefSleepMethod());
        thread4.start();


//        thread1.start(); // yeni thread yaradir
//        thread2.start();
//        thread3.start();
//        thread1.run(); // normal method kimi cagirmaq

    }
}
