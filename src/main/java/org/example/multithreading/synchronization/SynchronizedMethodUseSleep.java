package org.example.multithreading.synchronization;

public class SynchronizedMethodUseSleep {

    public synchronized void sayHello(String name) {
        System.out.println(name + " :Say Hello");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println(name + " : Allowed Hello");
    }


    public static void main(String[] args) {

        SynchronizedMethodUseSleep s = new SynchronizedMethodUseSleep();

        Thread t1 = new Thread(() -> {
            s.sayHello("Ragimov");
        });
        Thread t2 = new Thread(() -> {
            s.sayHello("Ismayil");
        });
        t1.start();
        t2.start();
    }
}
