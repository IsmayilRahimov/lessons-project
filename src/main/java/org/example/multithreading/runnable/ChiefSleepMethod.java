package org.example.multithreading.runnable;

public class ChiefSleepMethod  implements Runnable{
    @Override
    public void run() {
        System.out.println("Chief Sleep Method Started");
        for (int i = 0; i <= 5; i++){
            System.out.println(i + " :Addim");
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
