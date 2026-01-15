package org.example.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamWithArrays {

    public static void main(String[] args) {

        List<Integer> num = List.of(104, 300, 300, 39012, 1212, 332);

        num.stream()
                .sorted()
                .forEach(System.out::println);

        num.stream().sorted()
                .map(n -> n * 2)
                .forEach(System.out::println);

if (true && false) {
    System.out.println("Salam");
}

    }

}
