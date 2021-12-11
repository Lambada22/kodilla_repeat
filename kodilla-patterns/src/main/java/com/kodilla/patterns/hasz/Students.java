package com.kodilla.patterns.hasz;

import java.util.Objects;

public class Students {

    String name;
    String lastName;
    String clas;

    public Students(String name, String lastName, String clas) {
        this.name = name;
        this.lastName = lastName;
        this.clas = clas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(name, students.name) && Objects.equals(lastName, students.lastName) && Objects.equals(clas, students.clas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, clas);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", clas='" + clas + '\'' +
                '}';
    }
}
