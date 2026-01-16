package org.example.genneric;

import java.util.List;

public class UnboundedExample {


    public static void show(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {

        List<String> stringsList = List.of("a", "b", "c", "d", "e", "f", "g", "h");
        show(stringsList);
        UnboundedExample.show(stringsList);

    }
}
