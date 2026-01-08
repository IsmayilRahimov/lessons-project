package org.example.streamapi;

import java.util.ArrayList;
import java.util.List;

public class Persons {

    String surname;
    String name;
    int id;


    public Persons(String surname, String name, int id) {
        this.surname = surname;
        this.name = name;
        this.id = id;
    }


    @Override
    public String toString() {
        System.out.println("Persons{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}');
        return "Persons{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


    public static void main(String[] args) {

        List<Persons> list = new ArrayList<>();
        list.add(new Persons("Sam", "Sam", 1));
        list.add(new Persons("Sam", "Sam", 2));
        list.add(new Persons("Sam", "Sam", 3));
        list.add(new Persons("Sam", "Sam", 4));
        list.add(new Persons("Sam", "Sam", 5));
        list.add(new Persons("Sam", "Sam", 6));


        list.stream().forEach(System.out::println);
        list.stream().forEach(p -> System.out.println(p.toString()));
    }
}
