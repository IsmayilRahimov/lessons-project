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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teach teach = (Teach) o;
        return Objects.equals(name, teach.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
