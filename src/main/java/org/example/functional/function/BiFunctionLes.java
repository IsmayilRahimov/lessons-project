package org.example.functional.function;

import org.example.functional.objectuser.Person;

import java.util.function.BiFunction;

public class BiFunctionLes {


    public static void main(String[] args) {

        System.out.println(withBiFunction.apply(new Person(15),15));


    }

    static BiFunction<Person, Integer, String> withBiFunction =
            ((person, integer) -> person.getName() + "-" + (person.getAge() + integer));


}
