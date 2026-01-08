package org.example.wildcards.boundslower;

import java.util.ArrayList;
import java.util.List;

public class ExamLower {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        showData(list);
    }


    public static void showData(List<? super Integer> list1) {
        int result = 0;
        for (Object object : list1) {
            if (object instanceof Integer) {
                result += ((Integer) object).intValue();
            }
        }
        System.out.println(result);
    }

}
