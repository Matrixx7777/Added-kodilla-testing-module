package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> listForumUser = new ArrayList<>();

    public Forum() {
        listForumUser.add(new ForumUser(1,"Dawid", 'M', 1990, 3, 19, 1));
        listForumUser.add(new ForumUser(2,"Andrzej", 'M', 2001, 3, 3, 1));
        listForumUser.add(new ForumUser(3,"Patrycja", 'K', 1997, 11, 25, 1));
        listForumUser.add(new ForumUser(4,"Malwina", 'K', 1984, 6, 9, 2));
        listForumUser.add(new ForumUser(5,"Marek", 'M', 2003, 5, 29, 1));
        listForumUser.add(new ForumUser(6,"Izabela", 'K', 2000, 8, 7, 2));
        listForumUser.add(new ForumUser(7,"Mateusz", 'M', 2001, 7, 20, 1));
        listForumUser.add(new ForumUser(8,"Ania", 'K', 2002, 9, 14, 3));
        listForumUser.add(new ForumUser(9,"Witek", 'M', 1995, 2, 17, 1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(listForumUser);
    }
}
