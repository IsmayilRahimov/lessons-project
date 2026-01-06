package org.example.generic.methodgenerics;

public class AllGenerics {

    public static <T, K> void showPrint(T[] name, K[] age) {
        for (K k : age) {
            System.out.print(k + " :Age");
        }

        for (T t : name) {
            System.out.print(t + " :Name");
        }
    }


    public static void main(String[] args) {
        showPrint(new Integer[]{1, 2, 3}, new String[]{"", "", ""});
    }

}
