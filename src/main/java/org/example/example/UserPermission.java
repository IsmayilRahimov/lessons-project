package org.example.example;

import java.util.Set;

public enum UserPermission {

    STUDENT_READ("studentRead"),
    STUDENT_WRITE("studentWrite"),
    TEACHER_READ("teacherRead"),
    TEACHER_WRITE("teacherWrite");


    private final String permission;

    public String getPermission() {
        return permission;
    }

    UserPermission(String permission) {
        this.permission = permission;
    }


}
