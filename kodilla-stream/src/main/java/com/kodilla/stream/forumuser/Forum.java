package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    public static List<ForumUser> getUserList() {

        final List<ForumUser> theUserList = new ArrayList<>();
        theUserList.add(new ForumUser(123, "JohnSnow", 'M', LocalDate.of(2007, 12, 12), 2));
        theUserList.add(new ForumUser(456, "Arbuz", 'M', LocalDate.of(1990, 3, 1), 2));
        theUserList.add(new ForumUser(333, "Catelyn", 'F', LocalDate.of(1900, 1, 12), 12));
        theUserList.add(new ForumUser(000, "NoOne", 'M', LocalDate.of(2960, 3, 1), 555));
        theUserList.add(new ForumUser(997, "Policeman", 'M', LocalDate.of(1990, 5, 1), 112));
        return theUserList;


//    public List<ForumUser> getGetUserList() {
//        return getUserList;
//    }
    }
}