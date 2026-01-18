package org.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForList {


    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("John");
        name.add("Rick");
        name.add("Lick");
        name.add("Cick");

        name.forEach(System.out::println);
        for (String n : name) {
            System.out.println(n);
        }
        name.forEach(n -> System.out.println(n));

    }
}
