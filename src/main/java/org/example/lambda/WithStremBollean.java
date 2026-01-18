package org.example.lambda;

import java.util.Arrays;
import java.util.List;

public class WithStremBollean {


    public static void main(String[] args) {

        List<String> names = Arrays.asList("Rick", "Lick", "Cick");
        List<String> names2 = Arrays.asList("Lol", "All", "SAM");

        boolean exists = names.stream().anyMatch(names2::contains);
        System.out.println(exists);

        boolean allExists = names.stream().allMatch(names2::contains);

        System.out.println(allExists);

        boolean non = names.stream().noneMatch(names2::contains);
        System.out.println(non);

    }
}
