package org.example.passbyvalue;

public class PassByValueWithInteger {

    public static void artir(int x) {
        x++;
        System.out.println(x);
    }


    public static void main(String[] args) {
        int a = 5;
        int x = 6;
//        artir(a);
        artir(x);
//        System.out.println(a);
//        System.out.println(x);

    }
}
