package org.example.functionalprogramming.imperative.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        getConsumer.accept(new Person("Arzuman", "Musayev", Gender.MALE));
        getWithPhoneBiConsumer.accept(new Person("Arzu", "Cavadova", Gender.MALE), 10);
    }

    static Consumer<Person> getConsumer =
            p -> {
                System.out.println(p.getName() + p.getSurname() + p.getGender());
            };

    static BiConsumer<Person, Integer> getWithPhoneBiConsumer =
            (person, phone) -> {
                System.out.println(person.getName() + phone);
            };
}
