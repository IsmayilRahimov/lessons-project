package org.example.example;

import java.util.Set;

import static org.example.example.WeekDay.MONDAY;
import static org.example.example.WeekDay.WEDNESDAY;

public enum WeekForDays {
    ADMIN(Set.of(MONDAY, WEDNESDAY));
    private Set<WeekDay> weekDays;

    WeekForDays(Set<WeekDay> weekDays) {
        this.weekDays = weekDays;
    }

    public Set<WeekDay> getWeekDays() {
        return weekDays;
    }

    public static void main(String[] args) {
        WeekForDays wdf = WeekForDays.ADMIN;
        System.out.println(wdf);
    }


}
