package org.example.lambda;

public class MainInterface {


    public static void main(String[] args) {
        Run run = (age) -> {
            age++;
            System.out.println(age);

        };
        run.add(100);

    }
}
