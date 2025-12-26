package org.example.functional.function;

import org.example.functional.objectuser.Person;

import java.util.function.Function;

public class ApplyFunction {


    public static void main(String[] args) {

        System.out.println(showRazer.apply("Sutun"));
        System.out.println(showMe.apply("Sutun"));

        System.out.println(new Person("Anar", 25));
    }


    static Function<String, Integer> showRazer =
            n -> n.length();


    static Function<String, String> showMe =
            l -> l.toUpperCase();


    static Function<Person, Integer> showLess =
            person -> person.getAge();
}
