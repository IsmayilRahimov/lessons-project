package org.example.varkeys;

import org.example.functional.objectuser.Person;

import java.util.ArrayList;
import java.util.List;

public class LocalVar {


    public static void main(String[] args) {
        var x = 10;
        var m = "Hello";
        var a = "Java";


        var names = new ArrayList<String>();
        names.add("John");
        names.add("Rick");
        names.add("Ricky");
        names.add("Ricle");

        names.get(1);


        var names2 = List.of(1, 2, 3, 4, 5);
        for (var ma : names2) {
            System.out.println(ma);
        }

        var ml = "Salam".length();
        System.out.println(ml);


        var numbers = List.of(1, 2, 3, 4, 5, 6);

        var result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();
        System.out.println(result);


        System.out.println(m.concat(a));


        System.out.println(x + m);


        var person = new Person("Sammir", 15);
        System.out.println(person.getName());


    }
}
