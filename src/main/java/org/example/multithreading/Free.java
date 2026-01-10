package org.example.multithreading;

public class Free extends Thread {
    @Override
    public void run() {
        System.out.println("Free Loading");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Free Ready!");
    }
}
