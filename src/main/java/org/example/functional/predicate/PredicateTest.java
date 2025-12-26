package org.example.functional.predicate;

import org.example.functional.objectuser.Person;

import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {


    public static void main(String[] args) {
        System.out.println(booleanTest.test(2));
        System.out.println(booleanTest.test(1));

        System.out.println(showText.test("Amir"));

    }


    List<Person> showPerson = List.of(
            new Person("Samir", 26),
            new Person("Anar", 25),
            new Person("Faiq", 15)
    );





    static Predicate<Integer> booleanTest =
            n -> n % 2 == 0;


    static Predicate<String> showText =
            name -> name.equals("Samir");
}
