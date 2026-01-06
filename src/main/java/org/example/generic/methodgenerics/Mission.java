package org.example.generic.methodgenerics;

public class Mission {


    public static <E> void show(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }


    public static <T, E> void print(T[] array, E[] arrays) throws Exception {
        for (T element : array) {
            System.out.println(element);
        }
        for (E elements : arrays) {
            System.out.println(elements);
            if (elements == null) {
                throw new Exception("Error");
            }
        }
    }


    public static void main(String[] args) throws Exception {

        print(new String[]{"a","b"},new Integer[]{1,5});



    }
}
