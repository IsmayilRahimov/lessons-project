package org.example.functional.predicate;

import org.example.functional.objectuser.Person;

import java.util.function.BiPredicate;

public class BiPredicateTest {


    public static void main(String[] args) {

        System.out.println(showYearAge.test(new Person(15), 16));


    }


    static BiPredicate<Person, Integer> showYearAge =
            (person, age) -> person.getAge() > age;
}
