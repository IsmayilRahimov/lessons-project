package org.example.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {

    public String name;
    public int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        list.add(new User("Samir", 1));
        list.add(new User("Ismayil", 2));
        list.add(new User("Sahib", 3));
        list.add(new User("Musa", 4));

        list.stream().forEach(User::toString);//method reference
        list.stream().forEach(System.out::println);

        List<User> filtered = list.stream()
                .filter(user -> user.id > 2)
                .collect(Collectors.toList());
        System.out.println(filtered);


    }
}
