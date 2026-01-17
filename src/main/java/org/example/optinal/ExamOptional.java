package org.example.optinal;

import java.util.Optional;

public class ExamOptional {

    public static void main(String[] args) {


        Optional<String> optional = Optional.empty();
        System.out.println(optional.isPresent());
        optional = Optional.of("test");
        System.out.println(optional.isPresent());
        optional = Optional.of("test");
        System.out.println(optional.isPresent());

    }
}
