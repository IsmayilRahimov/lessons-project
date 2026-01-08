package org.example.wildcards.upperbounds;

import java.util.List;

public class ExamUpper {


    public static void main(String[] args) {
        List<Double> doubles = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println(showData(doubles));

    }


    public static Double showData(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
