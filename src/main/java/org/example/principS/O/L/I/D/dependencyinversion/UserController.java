package org.example.principS.O.L.I.D.dependencyinversion;

public class UserController {


    private final UsersCService usersCService;

    public UserController(UsersCService usersCService) {
        this.usersCService = usersCService;
    }

    public void saveUser(String data) {
        usersCService.saveUser(data);
    }

    public void getAllUsers() {
        usersCService.getAllUsers();
    }


}
