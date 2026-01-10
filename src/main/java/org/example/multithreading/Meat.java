package org.example.multithreading;

public class Meat extends Thread {
    public void run() {
        System.out.println("Meat Loading");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Meat Done!");
    }

}
