package org.example.functionalprogramming.imperative.predicate;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.consumer.Person;

public class ExamplePredicate {

    public static void main(String[] args) {

        System.out.println(isEquals(new Person("Arzuman", "Samirov", Gender.MALE)));
    }


    static Boolean isEquals(Person person) {
        if (person.getName().equals("Arzuman") && person.getGender().equals(Gender.MALE)) {
            return true;
        }
        return false;
    }
}
