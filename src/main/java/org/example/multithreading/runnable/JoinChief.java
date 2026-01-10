package org.example.multithreading.runnable;

public class JoinChief implements Runnable {
    @Override
    public void run() {
        System.out.println("Join Chief Methods");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " For : Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            System.out.println("Pizza is loading");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Pizza is ready");
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("Tort is loading");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tort is ready");
        });

        thread1.start();
        System.out.println("Pizzani gozleyirem");
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Pizzani yeye bilerem:");


    }
}
