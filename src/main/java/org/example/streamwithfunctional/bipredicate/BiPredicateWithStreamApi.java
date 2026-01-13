package org.example.streamwithfunctional.bipredicate;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.streamwithfunctional.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateWithStreamApi {


    public static void main(String[] args) {

        System.out.println(withPredicate.test
                (new Person("Samir", 20, Gender.MALE)
                        , new Person("Musa", 25, Gender.MALE)));


        List<Person> allPersons = new ArrayList<>();
        allPersons.add(new Person("Samir", 20, Gender.MALE));
        allPersons.add(new Person("Musa", 25, Gender.FEMALE));

        List<Person> streamWithBiPredicate =
                allPersons.stream()
                        .filter(p1 -> allPersons.stream()
                                .anyMatch(p2 -> withPredicate.test(p1, p2) && p1 != p2))
                        .toList();


        streamWithBiPredicate.forEach(System.out::println);



    }


    static BiPredicate<Person, Person> withPredicate =
            (p1, p2) -> p1.getAge() == p2.getAge();
}
