package org.example.generic;

public class MethodGener {


    static <T> void show(T value) {
        System.out.println(value);
    }


    public static void main(String[] args) {
        show(1);
        show("A");
        show('B');
        show(true);


    }
}
