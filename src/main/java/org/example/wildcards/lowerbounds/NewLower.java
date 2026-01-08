package org.example.wildcards.lowerbounds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class NewLower {

    public static void main(String[] args) {

//        List<Object> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        showData(list);

//        List<Object> list2 = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i");
//        showData(list2);
        List<String> metn = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i");
        showLess(metn);

    }


    public static void showData(List<? super Integer> data) {
        for (Object object : data) {
            System.out.println(object);
        }
    }

    public static void showLess(List<?> listData) {
        for (Object object : listData) {
            System.out.println(object);
        }



        }
    }

