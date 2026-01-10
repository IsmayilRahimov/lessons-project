package org.example.multithreading.synchronization;

public class Sleep {

    public void show(String name){
        System.out.println(name + " Sleeping");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        System.out.println(name + " Oyandi");
    }
}
