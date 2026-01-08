package org.example.streamapi.filteredstream;

import org.example.streamapi.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterWith {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Cavadov", 1));
        userList.add(new User("Musayev", 2));
        userList.add(new User("Quliyev", 3));
        userList.add(new User("Sabirov", 4));
        userList.add(new User("Sabirov", 5));


        List<User> filterUsers =
                userList.stream()
                        .filter(user -> user.name != null)
                        .collect(Collectors.toList());
        filterUsers.forEach(user -> System.out.println(user.id));

        userList.forEach(user -> System.out.println(user.toString()));

    }
}
