package org.example.functional.biconsumer;

import org.example.functional.objectuser.Person;

import java.util.function.BiConsumer;

public class BiConsumerWithPerson {

    public static void main(String[] args) {

        withNewName.accept(new Person(24), "Al");



    }


    static BiConsumer<Person, String> withNewName =
            (person, newName) -> person.setName(newName);
}
