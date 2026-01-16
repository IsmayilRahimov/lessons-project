package org.example.principS.O.L.I.D.dependencyinversion;

public class MainDependencyInversion {


    public static void main(String[] args) {

        MySqlDatabase mySqlDatabase = new MySqlDatabase();
        UserService userService = new UserService(mySqlDatabase);
        userService.saveUser("admin");



    }
}
