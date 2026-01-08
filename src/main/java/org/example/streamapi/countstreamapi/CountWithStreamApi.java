package org.example.streamapi.countstreamapi;

import java.util.List;

public class CountWithStreamApi {

    public static void main(String[] args) {

        List<Integer> countList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Long countFirst = countList.stream()
                .filter(u -> u % 2 == 0)
                .count();
        System.out.println(countFirst);

    }
}
