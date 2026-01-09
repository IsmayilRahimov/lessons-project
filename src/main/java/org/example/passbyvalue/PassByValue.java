package org.example.passbyvalue;

import org.example.streamapi.User;

public class PassByValue {

    String name;

    public void test() {
        System.out.println(name);
    }

    public static void main(String[] args) {

        PassByValue p = new PassByValue();

//        p.name = "<UNK>";
//        System.out.println(p.name);
//
//        p = new PassByValue();
        p.name = "A";

        PassByValue p2 = new PassByValue();
        p2.name = "B";

        p = p2; // A = B
        System.out.println(p.name); // B
        p.name = "C";
        p2 = p;
        System.out.println(p2.name);
//        System.out.println(p.name); // null
//        p.name = "Not Null";
//        System.out.println(p.name);


//        p.test();


    }
}
