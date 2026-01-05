package org.example.generic;

public class BoxGenerics<T> {

    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }


    public static void main(String[] args) {


        BoxGenerics<String> box = new BoxGenerics<>();
        box.set("1");
        box.set("2");
        String set2 = box.get();

        System.out.println(set2);
    }

}
