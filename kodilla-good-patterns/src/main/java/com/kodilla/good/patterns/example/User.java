package com.kodilla.good.patterns.example;

public class User {
    public String name;
    public String surname;

    public User(String name, String surName) {
        this.name = name;
        this.surname = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surname + '\'' +
                '}';
    }
}
