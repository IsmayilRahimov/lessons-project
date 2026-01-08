package org.example.streamapi.mapstream;

import org.example.streamapi.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteredMapWtihStream {


    public static void main(String[] args) {

        List<User> list = new ArrayList<>();

        list.add(new User("Sam", 1));
        list.add(new User("Zeyneb", 2));
        list.add(new User("Azad", 3));
        list.add(new User("Afiq", 4));
        list.add(new User("Aqsin", 5));

        List<User> mapFiltered = list.stream()
                .filter(u -> u.name.equals("Azad"))
                .map(user -> new User("Mr: " + user.name, user.id))
                .collect(Collectors.toList());
        mapFiltered.forEach(System.out::println);


    }
}
