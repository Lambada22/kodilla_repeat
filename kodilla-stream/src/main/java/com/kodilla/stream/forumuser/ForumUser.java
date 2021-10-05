package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int login;
    private final String name;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsAmmount;

    public ForumUser(int login, String name, char sex, LocalDate dateOfBirth, int postsAmmount) {
        this.login = login;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postsAmmount = postsAmmount;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getPostsAmmount() {
        return postsAmmount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "login=" + login +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsAmmount=" + postsAmmount +
                '}';
    }
}
