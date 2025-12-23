package org.example.imperative;

import org.example.functionalprogramming.imperative.consumer.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AproachTypes {


    public static void main(String[] args) {
        getImperative();
        getDeclerative();
    }

    public static void getImperative() {
        List<Person> persons = List.of(
                new Person("Samir", "Eliyev", Gender.MALE),
                new Person("Musa", "Afayev", Gender.MALE),
                new Person("Zeyneb", "Cavadova", Gender.FEMALE)
        );
        List<Person> human = new ArrayList<>();

        for (Person person : persons) {
            if (person.getGender() == Gender.MALE) {
                human.add(person);
            }
        }
        System.out.println("Human list: " + human);

    }

    public static List<Person> getDeclerative() {
        List<Person> persons = List.of(
                new Person("Samir", "Eliyev", Gender.MALE),
                new Person("Musa", "Afayev", Gender.MALE),
                new Person("Zeyneb", "Cavadova", Gender.FEMALE)
        );


        return persons
                .stream()
                .filter(person -> Gender.MALE.equals(person.getGender()))
                .collect(Collectors.toList());


    }
}

