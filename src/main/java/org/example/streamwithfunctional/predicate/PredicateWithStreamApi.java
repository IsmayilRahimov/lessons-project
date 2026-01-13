package org.example.streamwithfunctional.predicate;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.streamwithfunctional.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateWithStreamApi {

    public static void main(String[] args) {

        System.out.println(withPredicate.test(new Person("Asim", 20, Gender.MALE)));
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Zaur", 20, Gender.MALE));
        personList.add(new Person("Raj", 20, Gender.FEMALE));
        personList.add(new Person("David", 20, Gender.FEMALE));
        personList.add(new Person("Karl", 20, Gender.MALE));

        List<Person> filteredPersonList =
                personList.stream()
                        .filter(withPredicate)
                        .collect(Collectors.toList());
        filteredPersonList.forEach(System.out::println);



        List<Person> filteredWithFemale =
                personList.stream()
                        .filter(withWomen)
                        .collect(Collectors.toList());
        filteredWithFemale.forEach(System.out::println);
    }


    static Predicate<Person> withPredicate =
            p -> p.getAge() >= 18 && p.getGender() == Gender.MALE;

    static Predicate<Person> withWomen =
            p -> p.getAge() >= 18 && p.getGender() == Gender.FEMALE;

}
