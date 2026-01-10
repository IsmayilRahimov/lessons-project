package org.example.multithreading.runnable;

import lombok.SneakyThrows;

public class ChiefCakes implements Runnable {

    private String type;


    public ChiefCakes(String type) {
        this.type = type;
    }

    @SneakyThrows
    @Override
    public void run() {
        System.out.println(type + " :Loading");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(type + " :Done Loading");
    }
}
