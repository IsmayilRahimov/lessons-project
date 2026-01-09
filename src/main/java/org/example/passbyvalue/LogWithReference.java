package org.example.passbyvalue;

import java.util.logging.Logger;

public class LogWithReference {

    private static final Logger log
            = Logger.getLogger(LogWithReference.class.getName());

    public static void save() throws InterruptedException {
//        Thread.sleep(5000);
        log.info(Thread.currentThread().getName());
        log.getName();
    }


    public static void main(String[] args) throws InterruptedException {
        save();
    }
}
