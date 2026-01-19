package org.example.lambda;

import org.example.streamapi.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

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

        long filterednames = name.stream().filter(n -> n.startsWith("R") || n.endsWith("K")).count();
        name.stream().map(String::toUpperCase).forEach(System.out::println);


        Consumer<User> method =
                (n) -> System.out.println(n);

       System.out.println(filterednames);

    }
}
