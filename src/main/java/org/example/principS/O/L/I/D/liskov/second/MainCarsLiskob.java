package org.example.principS.O.L.I.D.liskov.second;

public class MainCarsLiskob {

    public static void main(String[] args) {

        Cars cars = new MercedesBenz();
        Cars carsToyota = new Toyota();

        carsToyota.run();
        cars.run();
        cars.breaking();
        cars.inPool();


    }
}
