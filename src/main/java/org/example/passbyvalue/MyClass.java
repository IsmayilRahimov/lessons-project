package org.example.passbyvalue;

import java.util.Map;

public class MyClass {

    private String name = init();


//    public MyClass() {
//        System.out.println("Constructor");
//    }

    private String init() {
        System.out.println("Init Method");
        return "Test";
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.init();

    }
}
