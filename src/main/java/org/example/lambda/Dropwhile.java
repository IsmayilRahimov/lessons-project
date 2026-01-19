package org.example.lambda;

import java.util.List;
import java.util.stream.Stream;

public class Dropwhile {

    public static void main(String[] args) {


        Stream<String> stream = Stream.of("a", "b", "c", "d", "e", "f");

        stream.takeWhile(s -> s.contains("a")).forEach(System.out::println);

        List<String> name = stream.dropWhile(s -> s.contains("a")).toList();
        name.forEach(System.out::println);
    }
}
