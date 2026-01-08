package org.example.streamapi;

import java.util.ArrayList;
import java.util.List;

public class User {

    public String name;
    public int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        System.out.println("User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}');
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        list.add(new User("Samir",1));
        list.add(new User("Ismayil",2));
        list.add(new User("Sahib",3));
        list.add(new User("Musa",4));

//        list.stream().forEach(System.out::println);
        list.stream().forEach(User::toString); //method reference

    }
}
