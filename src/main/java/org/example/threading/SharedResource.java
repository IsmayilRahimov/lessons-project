package org.example.threading;

public class SharedResource {

    void doWait() {
        synchronized (this) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting");
                wait();
                System.out.println(Thread.currentThread().getName() + " Thread is active");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    void doNotify() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " Notifying + calling Thread");
            notify();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(sharedResource::doWait );
        thread1.start();
        Thread.sleep(2000);
        Thread thread2 = new Thread(sharedResource::doNotify);
        thread2.start();



    }
}
