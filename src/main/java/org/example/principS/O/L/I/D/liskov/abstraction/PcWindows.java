package org.example.principS.O.L.I.D.liskov.abstraction;

public class PcWindows extends CompTime {

    @Override
    void stop() {

    }

    @Override
    void show() {

    }

    @Override
    void start() {
        System.out.println("This is the PcWindows implementation");

    }

    public static void main(String[] args) {
        CompTime pcWindows = new PcWindows();
        pcWindows.start();

    }
}
