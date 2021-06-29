package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private Statistics statistics;
    private int users;
    private int posts;
    private int comments;
    private double postsOfUser;
    private double commentsOfUser;
    private double commentsOfPost;


    public ForumStatistics(Statistics statistics){
        this.statistics = statistics;
    }

    public int getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getPostsPerUser() {
        return postsOfUser;
    }

    public double getCommentsPerUser() {
        return commentsOfUser;
    }

    public double getCommentsPerPost() {return commentsOfPost;}


    public void calculateAdvStatistics(Statistics statistics) {

        users = statistics.userNames().size();
        posts = statistics.postCount();
        comments = statistics.commentCount();

        if (statistics.userNames().size() != 0) {
           postsOfUser = statistics.postCount() / statistics.userNames().size();
           commentsOfUser = statistics.commentCount() / statistics.userNames().size();
        } else {
            postsOfUser = 0;
            commentsOfUser =0;
        }

        if (statistics.postCount() != 0) {
            commentsOfPost = statistics.commentCount() / statistics.postCount();
        } else {
            commentsOfPost = 0;
        }
    }

    public void showStatistics(){
        System.out.println("All users = " + users + "\n" +
                "Posts users = " + posts + "\n" +
                "Comments users = " + comments + "\n" +
                "Average number of post per user" + postsOfUser + "\n" +
                "Average number of comments per user" + commentsOfUser + "\n" +
                "Average number of comments per post" + commentsOfPost);
    }
}
