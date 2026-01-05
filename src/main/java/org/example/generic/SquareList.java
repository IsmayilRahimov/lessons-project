package org.example.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SquareList {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("1");

        list.add("2");

        list.add("3");

        list.add("4");


        try {
            System.out.println(list.get(6));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + "Xeta");
        } finally {
            System.out.println();
        }

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        String name = iterator.next();
        if (name.equals("1")) {
            iterator.remove();
        }


    }
}
