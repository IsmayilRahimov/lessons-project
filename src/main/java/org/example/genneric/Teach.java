package org.example.genneric;

import java.util.Objects;

public class Teach {


    public String name;

    public Teach(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teach{" +
                "name='" + name + '\'' +
                '}';
    }


}
