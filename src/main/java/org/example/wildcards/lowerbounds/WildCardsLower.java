package org.example.wildcards.lowerbounds;

import java.util.Arrays;
import java.util.List;

public class WildCardsLower {


    public static void main(String[] args) {

        List<Object> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        addNumbers(list1);

    }


    public static void addNumbers(List<? super Integer> list) {
        for (Object referans : list) {
            System.out.println(referans);
        }
    }

}
