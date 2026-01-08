package org.example.streamapi.countstreamapi;

import org.example.streamapi.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserWithCount {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("A", 1));
        users.add(new User("B", 2));
        users.add(new User("C", 3));
        users.add(new User("D", 4));
        users.add(new User("E", 5));

        Long count = users.stream().collect(Collectors.counting());
        System.out.println(count);

    }
}
