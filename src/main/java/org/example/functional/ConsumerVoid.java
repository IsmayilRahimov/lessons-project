package org.example.functional;

import org.example.functionalprogramming.imperative.consumer.Gender;
import org.example.functionalprogramming.imperative.predicate.Human;

import java.util.List;
import java.util.function.Consumer;



public class ConsumerVoid {


    public static void main(String[] args) {
        List<Integer> num = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        num.forEach(System.out::println);
        showPrint.accept("This is Consumer Void Method");
        showHuman.accept(new Human("Samir",1997, Gender.MALE,"555"));

    }


    static Consumer<String> showPrint =
            print -> System.out.println(print);


    static Consumer<Human> showHuman =
            h-> h.getName().equals("Samir");



    List<Integer> list1 = List.of(1, 2, 3, 4, 5);


}
