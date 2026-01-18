package org.example.lambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamWithList {


    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("John");
        name.add("Rick");
        name.add("Lick");
        name.add("Cick");


        List<String> search = new ArrayList<>();
        search.add("ohn"); // burada eyni ad olmadigi ucun false verir
        search.add("Rick");
        search.add("Lick");
        search.add("Cick");

        name.stream().filter((search::contains)).forEach(System.out::println); // yalniz uygun olanlari tapir

        Set<String> set = new HashSet<>(name);

        set.stream().filter((search::contains)).forEach(System.out::println);


        List<String> common = name.stream().filter(search::contains).toList();
        System.out.println(common); // list kimi  almaq


    }
}
