package org.example.principS.O.L.I.D.dependencyinversion;

public class UserService {

    private final MySqlDatabase database;

    public UserService(MySqlDatabase database) {
        this.database = database;
    }

    void saveUser(String name) {
        System.out.println(name + " Saved");
    }
}
