package org.example.example;


import com.google.common.collect.Sets;

import java.util.Set;

import static org.example.example.UserPermission.*;

public enum UserRole {

    TEACHER(Sets.newHashSet(TEACHER_READ, TEACHER_WRITE)),

    STUDENT(Sets.newHashSet(STUDENT_READ, STUDENT_WRITE));


    private final Set<UserPermission> permissions;

    UserRole(Set<UserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<UserPermission> getPermissions() {
        return permissions;
    }


}
