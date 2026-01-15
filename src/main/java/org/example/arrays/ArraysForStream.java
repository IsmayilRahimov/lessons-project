package org.example.arrays;

import java.util.HashMap;

public class ArraysForStream {


    public static void main(String[] args) {

        String sentence = "Salam necesiniz neyniyirsiniz ,Salam yaxsiyam yaxsi olasiniz, siz necesiniz, neyniyirsiniz";

        String[] words = sentence.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                int count = map.get(word);
                count++;
                map.put(word, count);
            }
            else {
                map.put(word, 1);
            }
        }


        System.out.println(map);
    }
}
