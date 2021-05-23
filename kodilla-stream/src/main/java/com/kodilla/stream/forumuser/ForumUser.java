package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate born;
    private final int numberOfPost;

    public  ForumUser(final int id,final String name, final char sex, int year, int month, int dayOfMonth,
                      final int numberOfPost){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.born = LocalDate.of(year,month,dayOfMonth);
        this.numberOfPost = numberOfPost;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBorn() {
        return born;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    @Override
    public String toString() {
        return "List{" +
                "Id ='" + id + '\'' +
                ", user ='" + name + '\'' +
                ", sex ='" + sex + '\'' +
                ", Born =" + born.getYear() + " " + born.getMonth() + " " + born.getDayOfMonth() + '\'' +
                ", Number of post ='" + numberOfPost + '\'' +
                '}';
    }
}
