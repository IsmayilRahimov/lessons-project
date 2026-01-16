package org.example.genneric;

public class MyGenericClas<E> {

    public E object;

    public void print(E element) {
        System.out.println(element);
    }

    public void add(E element) {
        object = element;
    }


    public static void main(String[] args) {
        MyGenericClas<String> generic = new MyGenericClas<>();
        generic.add("hello");
        generic.add("world");
        generic.add("hello");


        System.out.println(generic.object);

        generic.print("hello");

    }
}
