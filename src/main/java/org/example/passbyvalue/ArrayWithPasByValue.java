package org.example.passbyvalue;

public class ArrayWithPasByValue {


    public static void test(int[] x) {
        x[0]++;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        test(arr);
        System.out.println(arr[0] + arr[1]); //5


    }
}
