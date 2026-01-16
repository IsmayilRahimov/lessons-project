package org.example.principS.O.L.I.D.dependencyinversion;

public class MySqlDatabase implements Database {
    @Override
    public void saveUser(String data) {
        System.out.println(data + " Saved");
    }

}
