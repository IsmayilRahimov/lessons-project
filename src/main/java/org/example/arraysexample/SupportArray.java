package org.example.arraysexample;

public class SupportArray {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        if (numbers[1] == 1) {
            System.out.println("1");
        } else {
            System.out.println("1 -ci indeks :" + numbers[1] + " deyil.");
        }
    }
}
