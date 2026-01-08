package org.example.streamapi;

import java.util.ArrayList;
import java.util.List;

public class ExamMap {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        list.stream()
                .map(x -> x * 2)
                .forEach(System.out::println);


    }
}
