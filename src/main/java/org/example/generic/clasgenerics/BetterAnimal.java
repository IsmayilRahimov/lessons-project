package org.example.generic.clasgenerics;

public class BetterAnimal<T, E> {

    T name;

    T surname;

    E age;

    E bornYear;


    public BetterAnimal(T name, T surname, E age, E bornYear) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.bornYear = bornYear;
    }

    public T getName() {
        return name;
    }

    public T getSurname() {
        return surname;
    }

    public E getAge() {
        return age;
    }

    public E getBornYear() {
        return bornYear;
    }

    public void display() {
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nAge: " + age);
    }

    public static void testBetterAnimal() {
        BetterAnimal<String, Integer> animal = new BetterAnimal<>("Dog", "Jake", 10, 1992);
        System.out.println(animal.toString());
    }

    public static String test2() {
        BetterAnimal<String, Integer> showAnimal = new BetterAnimal<>("Scotish", "Cat", 5, 2996);
        return showAnimal.toString();
    }


    @Override
    public String toString() {
        return "BetterAnimal{" +
                "name=" + name +
                ", surname=" + surname +
                ", age=" + age +
                ", bornYear=" + bornYear +
                '}';
    }


    public static void main(String[] args) {

        testBetterAnimal();

        String result = test2();
        System.out.println(result);
    }
}
