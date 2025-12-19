package org.example.functionalprogramming.imperative.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApproachTypes {

    public static void main(String[] args) {
        imperativeAprrocachType();
        System.out.println(declarativeAprrocachType());
    }


    public static void imperativeAprrocachType() {
        List<Person> person = List.of(
                new Person("Ismayil", "Ragimov", Gender.MALE),
                new Person("Musa", "Aliyev", Gender.MALE),
                new Person("Zeyneb", "Musayeva", Gender.FEMALE)
        );

        List<Person> filteredPerson = new ArrayList<>();

        for (Person p : person) {
            if (p.getGender() == Gender.MALE) {
                filteredPerson.add(p);
            }

        }
        System.out.println("Filtered Person List: " + filteredPerson);
    }

    public static List<Person> declarativeAprrocachType() {
        List<Person> persons = List.of(
                new Person("Zaur", "Sadigov", Gender.MALE),
                new Person("Samira", "Aliyeva", Gender.FEMALE),
                new Person("Zehra", "Musayeva", Gender.FEMALE)

        );
        return persons
                .stream()
                .filter(p -> Gender.MALE.equals(p.getGender()))
                .collect(Collectors.toList());
    }
}
