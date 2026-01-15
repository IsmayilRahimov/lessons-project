package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArraysSentence {

    public static void main(String[] args) {


        String sentence = "Salam necesiniz . Salam necesiniz . Salam yaxsiyam";

        String[] words = sentence.split(" ");
        String[] sozler = sentence.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                int count = map.get(word);
                count++;
                map.put(word, count);
            } else {
                map.put(word, 1);
            }
        }

        Map<String, Integer> map2 = new HashMap<>();

        for (String soz : sozler) {
            if (map2.containsKey(soz)) {
                int count = map2.get(soz);
                count++;
                map2.put(soz, count);

            } else {
                map2.put(soz, 1);
            }

            System.out.println(map2);

            System.out.println();
            System.out.println(map);


        }
    }


}
