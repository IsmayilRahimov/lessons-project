package org.example.wildcards;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWild {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(add(list));
    }


    public static Double add(ArrayList<? extends Number> array) {
        double result = 0.0;
        for (Number number : array) {
            result += number.doubleValue();
        }
        return result;
    }
}
