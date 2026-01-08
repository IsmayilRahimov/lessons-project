package org.example.streamapi.mapstream;

import org.example.streamapi.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExamMapWithStream {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Rag", 251));
        users.add(new User("Ra", 252));
        users.add(new User("Ragimo", 2));
        users.add(new User("Ragi", 5));
        users.add(new User("Ragim", 255));


        Map<Integer, String> mapped = users.stream().collect(Collectors.toMap(user -> user.id, user -> user.name));
        mapped.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });

    }
}
