package org.example.functional;

import org.example.functional.objectuser.Person;

import java.util.function.Consumer;

public class WithPersonConsumer {

    public static void main(String[] args) {
        showPersonWithName.accept(new Person("Samir", 20));
        showPersonWithAge.accept(new Person(14));
        integerwithConsumer.accept(255);

    }


    static Consumer<Integer> integerwithConsumer =
            i -> System.out.println(i / 6);

    static Consumer<Person> showPersonWithName =
            n -> System.out.println("Person name: " + n.getName());


    static Consumer<Person> showPersonWithAge =
            n -> System.out.println("Person age: " + n.getAge());
}
