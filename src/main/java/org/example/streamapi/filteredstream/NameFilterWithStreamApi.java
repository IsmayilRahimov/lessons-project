package org.example.streamapi.filteredstream;

import org.example.streamapi.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameFilterWithStreamApi {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("a", 0));
        users.add(new User("b", 2));
        users.add(new User("c", 3));
        users.add(new User("d", 4));
        users.add(new User("e", 5));


        List<User> filteredUsers =
                users.stream()
                        .filter(u -> u.id != 0)
                        .collect(Collectors.toList());
        filteredUsers.forEach(u -> System.out.println(u.name));

    }


}

