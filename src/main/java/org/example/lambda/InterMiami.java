package org.example.lambda;

import java.util.List;
import java.util.stream.Stream;

public class InterMiami {

    public static void main(String[] args) {

        Stream<Integer> streams = Stream.of(1, 2, 3);

        List<Integer> list = List.of(1, 2, 3);

        streams.takeWhile(i -> i % 2 == 0).forEach(System.out::println);
        List<Integer> list1 = streams.takeWhile(i -> i + 1 == 5).toList();
        list1.forEach(System.out::println);

        list.stream().map(x -> x % 2 == 0).toList();

    }
}
