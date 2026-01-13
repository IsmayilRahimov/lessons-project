package org.example.streamwithfunctional.function;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.streamwithfunctional.Person;

import java.util.List;
import java.util.function.Function;

public class FunctionWithStreamApi {


    public static void main(String[] args) {

        System.out.println(withFunction.apply(10));
        withFunction.apply(10);


        List<Person> people = List.of(new Person("Samir", 29, Gender.MALE),
                new Person("Afiq", 20, Gender.MALE));
        people.stream()
                .map(withStreamFunction)
                .forEach(System.out::println);


        people.stream()
                .map(customMapper)
                .forEach(System.out::println);

        people.stream()
                .map(withLower)
                .forEach(System.out::println);


    }

    static Function<Integer, String> withFunction =
            integer -> String.valueOf(integer);

    static Function<Person, String> withStreamFunction =
            person -> person.getName() + " " + person.getAge();

    static Function<Person, String> customMapper =
            p -> p.getAge() == 20 ? p.getName().toUpperCase() : p.getName();

    static Function<Person, String> withLower =
            p -> p.getAge() >= 20 ? p.getName().toLowerCase() : p.getName();
}
