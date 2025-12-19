package org.example.functionalprogramming.imperative;

import java.util.ArrayList;
import java.util.List;

public class ApproachTypes {

    public static void main(String[] args) {
        aprrocachType();
    }


    public static void aprrocachType() {
        List<Person> person = List.of(
                new Person("Ismayil", "Ragimov", Gender.MALE),
                new Person("Musa", "Aliyev", Gender.MALE),
                new Person("Zeyneb", "Musayeva", Gender.FEMALE)
        );

        List<Person> filteredPerson = new ArrayList<>();

        for (Person p : person) {
            if (p.getGender() == Gender.MALE) {
                filteredPerson.add(p);
            } else if (p.getGender() == Gender.FEMALE) {
                filteredPerson.add(p);

            }
        }
        System.out.println("Filtered Person List: " + filteredPerson);
    }
}
