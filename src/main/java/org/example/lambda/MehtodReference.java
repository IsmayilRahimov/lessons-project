package org.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class MehtodReference {


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

        search.forEach(n -> System.out.println(name.contains(n))); // muqayise edir diger containle

    }
}
