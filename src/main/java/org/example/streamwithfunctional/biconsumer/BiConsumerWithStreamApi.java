package org.example.streamwithfunctional.biconsumer;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.streamwithfunctional.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class BiConsumerWithStreamApi {

    public static void main(String[] args) {

        withBiConsumer.accept(new Person("Ali", 20, Gender.MALE), new Person("Bob", 20, Gender.FEMALE));

        List<Person> people = List.of(new Person("Arzuman", 20, Gender.MALE),
                new Person("Cavad", 32, Gender.MALE),
                new Person("Aydin", 22, Gender.MALE),
                new Person("Afiq", 22, Gender.MALE));

        List<Person> filtered = people.stream()
                .filter(person -> people.stream().anyMatch(person1 -> person1.getAge() == person.getAge())).toList();
        filtered.forEach(System.out::println);

    }


    static BiConsumer<Person, Person> withBiConsumer =
            (person, person2) -> {
                System.out.println(person.getName() + " " + person2.getName());
            };


}
