package org.example.abstracttask;

import java.util.Arrays;

public class Buble {
    public static void main(String[] args) {


        int[] arr = {10, 7, 9, 6, 5};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }
}



