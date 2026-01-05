package org.example.generic;

import java.util.ArrayList;
import java.util.List;

public class TypeGenerics {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("2");

        String set = (String) list.get(1); //type casting

        list.add(set);

    }


}
