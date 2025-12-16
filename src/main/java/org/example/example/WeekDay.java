package org.example.example;

public enum WeekDay {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);


    private Integer day;

    WeekDay(Integer day) {
        this.day = day;
    }

    public Integer getDay() {
        return day;
    }


    public static void main(String[] args) {
        WeekDay wd = WeekDay.MONDAY;
        System.out.println(wd.getDay());
        WeekDay uc = WeekDay.WEDNESDAY;
        System.out.println(uc.getDay());
        System.out.println(wd.day);
    }
}
