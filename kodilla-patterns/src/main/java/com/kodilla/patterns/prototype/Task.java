package com.kodilla.patterns.prototype;

import java.util.Objects;

public class Task {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task task = (Task) obj;
        return Objects.equals(name, task.name);
    }

    @Override
    public String toString() {
        return "      Task [" + name + "]";
    }
}
