package org.example.varkeys;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.consumer.Person;

import java.time.LocalDateTime;

public class KeysVar {


    public static void main(String[] args) {

        var person = new Person("Sammir", "Ragimov", Gender.MALE);
        System.out.println(person.getName());


        var time = LocalDateTime.now();
        System.out.println(time);


    }
}
