package org.example.wildcards;

import java.util.ArrayList;
import java.util.List;

public class OneWildCardsIUpper {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        System.out.println(add(list));


        List<Float> list2 = new ArrayList<>();
        list2.add(1.0f);
        list2.add(2.0f);
        list2.add(3.0f);
        list2.add(4.0f);

        System.out.println(addShow(list2));


    }


    public static Integer add(List<? extends Number> list) {
        Integer result = 0;
        for (Number num : list) {
            result = result + num.intValue();
        }
        return result;
    }

    public static Float addShow(List<? extends Float> list) {
        Float result = 0.0F;
        for (Float num : list) {
            result = result + num.floatValue();
        }
        return result;
    }


}
