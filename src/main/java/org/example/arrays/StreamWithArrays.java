package org.example.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamWithArrays {

    public static void main(String[] args) {

        String sentence = "Hello World Hello Word Hello World";

        Map<Object, Long> result =
                Arrays.stream(sentence.split(" "))
                        .collect(Collectors.groupingBy(w -> w,
                                Collectors.counting()));
        System.out.println(result);

    }
}
