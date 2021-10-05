package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> theForumResult = Forum.getUserList().stream()
                .filter(u -> u.getSex() == 'M')
                .filter(user -> ChronoUnit.YEARS.between(user.getDateOfBirth(), LocalDate.now()) > 19)
                .filter(forumUser -> forumUser.getPostsAmmount() >= 1)
                .collect(Collectors.toMap(forumUser -> forumUser.getLogin(), forumUser -> forumUser));
        System.out.println(theForumResult);
    }

}
