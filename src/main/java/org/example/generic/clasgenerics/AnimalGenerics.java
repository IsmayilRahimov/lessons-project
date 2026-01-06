package org.example.generic.clasgenerics;

import org.example.intger.Psvm;

public class AnimalGenerics<T> {

    T age;
    T name;


    public void getData(T name) {
        this.name = name;
    }

    public void getDataAge(T age) {
        this.age = age;
    }


    public static <T> String show(T t) {
        return t.toString();
    }

    public static <T> String getName(T name) {
        return name.toString();
    }

    static <T> Integer getAge(T age) {
        return (Integer) age;
    }

    public static void main(String[] args) {

        AnimalGenerics<String> animal = new AnimalGenerics<>();
        animal.getData("Cat");
        animal.getDataAge("20");
        System.out.println(show("Generics Method"));
        animal.getAge(20);

    }


}
