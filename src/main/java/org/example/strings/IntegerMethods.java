package org.example.strings;

public class IntegerMethods {


    public static void main(String[] args) {

        Integer l = 127;
        Integer l2 = 127;
        System.out.println(l == l2);
        int a = -177;
        int b = -177;

        System.out.println(a == b);
//        System.out.println(a != b);

        Integer s1 = Integer.valueOf(100);
        Integer s2 = Integer.valueOf("2");
        Integer m = Integer.valueOf(100);

        System.out.println(s1 == m);
    }
}
