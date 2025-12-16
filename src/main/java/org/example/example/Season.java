package org.example.example;

public enum Season {

    STUDENT_READ("student:read"),
    STUDENT_WRITE("studen:write");
    private final String permission;

    Season(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }

    public static void main(String[] args) {

        Season season = Season.STUDENT_READ;
        System.out.println(season.getPermission());
        season = Season.STUDENT_WRITE;
        System.out.println(season.getPermission());

        System.out.println(season.getPermission());

    }
}
