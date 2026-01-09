package org.example.passbyvalue;

public class UserLb {


    public static void main(String[] args) {

        UserLb user = new UserLb();
        user.name = "A";
         user = new UserLb();
         user.name = "B";
         user = new UserLb();
         user.name = "C";
        System.out.println(user.name);

    }

    String name;
    int age;
}
