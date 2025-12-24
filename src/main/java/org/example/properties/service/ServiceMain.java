package org.example.properties.service;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.consumer.Person;

public class ServiceMain {

    public static void main(String[] args) {
        PersonService personService = new PersonService();
        personService.createPerson.accept(new Person("Azad", "Ms", Gender.MALE));
        personService.createPerson.accept(new Person("Ali", "Ms", Gender.MALE));
        System.out.println(personService.getAllPersons.get());
        System.out.println(personService.getPersonByName.apply("Azad"));
        personService.deleteByPerson.accept("Azad");
        System.out.println(personService.getAllPersons.get());
    }
}
