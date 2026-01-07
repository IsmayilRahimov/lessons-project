package org.example.wildcards.unbounded;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCards {

    public static void main(String[] args) {

        List<Object> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        showData(data);


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        showData(list1);


        List<String> dataName = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i");
        showData(dataName);


    }

    public static void showData(List<?> list) {

        for (Object referans : list) {
            System.out.println(referans);
        }
    }
}
