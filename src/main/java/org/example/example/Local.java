package org.example.example;

public enum Local {

    USER,
    ADMIN,
    MODERATOR,
    DEVELOPER,
    ;


    Local() {
    }

    public WeekDay getWeekDay() {
        return WeekDay.valueOf(this.name());
    }
}
