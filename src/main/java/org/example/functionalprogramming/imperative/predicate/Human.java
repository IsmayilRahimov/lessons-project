package org.example.functionalprogramming.imperative.predicate;

import org.example.functionalprogramming.imperative.consumer.Gender;

public class Human {

    private String name;
    private Integer year;
    private Gender gender;
    private String phoneNumber;

    public Human(String name, Integer year, Gender gender, String phoneNumber) {
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
