package org.example.genneric;

public class MyGenericsMethod<I extends Number> {


    public <E> void print(E e) {
        System.out.println(e);
    }


    public static void main(String[] args) {
        MyGenericsMethod myGenericsMethod = new MyGenericsMethod<>();
       myGenericsMethod.print(new Teach("Salam"));
    }
}
