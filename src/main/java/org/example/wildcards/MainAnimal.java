package org.example.wildcards;

import java.util.ArrayList;
import java.util.List;

public class MainAnimal {


    public static void less(List<? extends Animal> list) {
        for (Animal animal : list) {
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.setAge(10);
                dog.setName("BARKLY");
                dog.showAnimal();
                dog.bark();
                System.out.println(dog.getName());
                System.out.println(dog.getAge());
            }
        }

    }

    public static void main(String[] args) {

        Dog d1 = new Dog();
        List<Dog> dogs = List.of(d1);
        System.out.println(dogs.add(d1));

    }

}
