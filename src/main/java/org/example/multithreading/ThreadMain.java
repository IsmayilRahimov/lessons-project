package org.example.multithreading;

public class ThreadMain {


    public static void main(String[] args) {

        Free chief1 = new Free();
        Meat chief2 = new Meat();

        chief1.start();
        chief2.start();

        System.out.println("All chief ready:");


    }
}
