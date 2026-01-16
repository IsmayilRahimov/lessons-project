package org.example.genneric;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundExam {


    public static void add(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }


    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        add(numberList);


    }
}
