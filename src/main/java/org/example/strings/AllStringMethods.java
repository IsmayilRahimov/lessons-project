package org.example.strings;

public class AllStringMethods {


    public static void main(String[] args) {
        String s = "Salam";
        String s1 = "Necesen";


        System.out.println(s == s1);
        System.out.println(s.equals(s1));

        String a = new String("A");
        String b = new String("B");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(s == b); // false


    }
}
