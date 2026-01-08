package org.example.streamapi;

import java.util.ArrayList;
import java.util.List;

public class ForEachStream {


    public static void main(String[] args) {

        List<User> list = new ArrayList<>();

        list.add(new User("Sam", 1));
        list.add(new User("Zeyneb", 2));
        list.add(new User("Azad", 3));
        list.add(new User("Afiq", 4));
        list.add(new User("Aqsin", 5));

        list.stream()
                .forEach(u -> System.out.println(u.toString()));

    }
}
