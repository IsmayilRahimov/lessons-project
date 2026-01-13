package org.example.streamwithfunctional.consumer;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.streamwithfunctional.Person;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerWithStreamApi {


    public static void main(String[] args) {

        List<Person> people = List.of(new Person("Arzu", 20, Gender.FEMALE)
                , new Person("Arzuman", 20, Gender.MALE),
                new Person("Cavad", 32, Gender.MALE),
                new Person("Aydin", 22, Gender.MALE),
                new Person("Afiq", 21, Gender.MALE));

        people.stream()
                .filter(withPredicate)
                .forEach(withConsumer);

    }

    static Predicate<Person> withPredicate =
            p -> p.getGender() == Gender.MALE;

    static Consumer<Person> withConsumer =
            p -> System.out.println(p.getName() + " :Uygun olan wexsler");
}
