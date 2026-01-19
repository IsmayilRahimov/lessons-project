package org.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class ListFor {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Hello");


        for (String s : list) {
            System.out.println(s); // for methodu ile
        }

        list.forEach(System.out::println); // method reference ile

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // sade for ile
        }

    }
}
