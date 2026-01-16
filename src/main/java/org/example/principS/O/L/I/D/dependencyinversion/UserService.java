package org.example.principS.O.L.I.D.dependencyinversion;

public class UserService {

    private final Database database;

    public UserService(Database database) {
        this.database = database;
    }

    void saveUser(String name) {
        database.saveUser(name);
    }
}
