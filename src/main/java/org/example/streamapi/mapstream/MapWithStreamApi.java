package org.example.streamapi.mapstream;

import org.example.streamapi.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapWithStreamApi {


    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("e", 5));
        users.add(new User("f", 6));
        users.add(new User("g", 7));
        users.add(new User("h", 8));
        users.add(new User("i", 9));
        users.add(new User("j", 10));

        List<User> upperCaseList = users.stream()
                .filter(u -> u.id != 0)
                .map(user -> new User(user.name.toUpperCase(), user.id))
                .collect(Collectors.toList());
        upperCaseList.forEach(System.out::println);



    }
}
