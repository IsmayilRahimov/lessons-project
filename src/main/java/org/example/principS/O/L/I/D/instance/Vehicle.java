package org.example.principS.O.L.I.D.instance;

public class Vehicle {


    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println(car instanceof Car);
        System.out.println(bike instanceof Bike);
        System.out.println(car instanceof Bike);
        System.out.println(bike instanceof Car);
        System.out.println(car instanceof Vehicle);

    }
}
