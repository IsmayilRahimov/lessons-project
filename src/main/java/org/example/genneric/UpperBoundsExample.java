package org.example.genneric;

import java.util.List;

public class UpperBoundsExample {


    public static double sum(List<? extends Number> list) {
        double result = 0;
        for (Number number : list) {
            result += number.doubleValue();
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);

        System.out.println(sum(integerList));
        Double first = doubleList.get(1);
        System.out.println(first);
        System.out.println(sum(doubleList));

    }
}
