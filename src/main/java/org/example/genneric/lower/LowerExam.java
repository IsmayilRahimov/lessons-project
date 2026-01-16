package org.example.genneric.lower;

import java.util.ArrayList;
import java.util.List;

public class LowerExam {


    public static void add(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static Double sum (List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }


    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        add(numList);

        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);
        System.out.println(sum(doubleList));

    }

}
