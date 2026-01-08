package org.example.streamapi.filteredstream;

import org.example.streamapi.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterObject {


    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(new User("Cavadov", 1));
        userList.add(new User("Musayev", 2));
        userList.add(new User("Quliyev", 3));
        userList.add(new User("Sabirov", 4));
        userList.add(new User("Sabirov", 5));

        List<User> filteredId = userList.stream()
                .filter(user -> user.id > 1)
                .collect(Collectors.toList());
        List<User> filteredUserName = userList.stream()
                .filter(user -> user.name == "Sabirov")
                .collect(Collectors.toList());

        userList.stream()
                .filter(user -> user.id == 4)
                .map(user -> new User("Mr " + user.name, user.id ))
                .forEach(System.out::println);

        System.out.println("Filtered id: " + filteredId);
        System.out.println(filteredUserName);

    }
}
