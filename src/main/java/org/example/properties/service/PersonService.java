package org.example.properties.service;

import org.example.functionalprogramming.imperative.consumer.Person;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static org.example.properties.ApplicationConstant.persons;

public class PersonService {


    public void createPerson(Person person) {
        persons.add(person);
    }

    public Consumer<Person> createPerson =
            person -> persons.add(person);

    public Supplier<List<Person>> getAllPersons =
            () -> persons;

    public List<Person> getPerson(String name) {
        return persons
                .stream()
                .filter(person -> name.equals(person.getName()))
                .collect(Collectors.toList());
    }

    public Function<String, List<Person>> getPersonByName =
            name -> persons
                    .stream()
                    .filter(person -> name.equals(person.getName()))
                    .collect(Collectors.toList());

    public void deletePerson(String name) {
        Person found = persons
                .stream()
                .filter(person -> name.equals(person.getName()))
                .findFirst().get();
        persons.remove(found);
    }

    public Consumer<String> deleteByPerson =
            (name) -> {
                Person foundedPerson = persons.stream().filter(person -> name.equals(person.getName())).findFirst().get();

                persons.remove(foundedPerson);
            };


}
