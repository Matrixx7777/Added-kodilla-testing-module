package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @InjectMocks
    ForumStatistics forumStatistics;

    @Mock
   private Statistics statisticsMock;

    @BeforeEach
    void text(){
        System.out.println("We beginning");}

    @AfterEach
    void text2(){
        System.out.println("Testing completed successfully");
    }


    @Test
    void postsEquals0(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> users = new ArrayList<>();
        users.add("Asia");
        users.add("Kasia");
        int posts = 0;
        int comments = 10;

        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postCount()).thenReturn(posts);
        when(statisticsMock.commentCount()).thenReturn(comments);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(2, forumStatistics.getUsers());
        Assertions.assertEquals(0, forumStatistics.getPosts());
        Assertions.assertEquals(10, forumStatistics.getComments());
        Assertions.assertEquals(0, forumStatistics.getPostsPerUser());
        Assertions.assertEquals(5, forumStatistics.getCommentsPerUser());
        Assertions.assertEquals(0, forumStatistics.getCommentsPerPost());
    }

    @Test
    void postsEquals1000(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> users = new ArrayList<>();
        users.add("Malwina");
        users.add("Martyna");
        users.add("Renia");
        users.add("Ania");
        int posts = 1000;
        int comments = 250;

        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postCount()).thenReturn(posts);
        when(statisticsMock.commentCount()).thenReturn(comments);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(4,forumStatistics.getUsers());
        Assertions.assertEquals(1000,forumStatistics.getPosts());
        Assertions.assertEquals(250,forumStatistics.getComments());
        Assertions.assertEquals(250,forumStatistics.getPostsPerUser());
        Assertions.assertEquals(62,forumStatistics.getCommentsPerUser());
        Assertions.assertEquals(0,forumStatistics.getCommentsPerPost());
    }

    @Test
    void commentsEquals0(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> users = new ArrayList<>();
        users.add("Dominika");
        users.add("Patrycja");
        int posts = 100;
        int comments = 0;

        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postCount()).thenReturn(posts);
        when(statisticsMock.commentCount()).thenReturn(comments);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(2,forumStatistics.getUsers());
        Assertions.assertEquals(100,forumStatistics.getPosts());
        Assertions.assertEquals(0,forumStatistics.getComments());
        Assertions.assertEquals(50,forumStatistics.getPostsPerUser());
        Assertions.assertEquals(0,forumStatistics.getCommentsPerUser());
        Assertions.assertEquals(0,forumStatistics.getCommentsPerPost());
    }

    @Test
    void commentsLessThanPosts(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> users = new ArrayList<>();
        users.add("Marzena");
        int posts = 20;
        int comments = 10;

        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postCount()).thenReturn(posts);
        when(statisticsMock.commentCount()).thenReturn(comments);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(1,forumStatistics.getUsers());
        Assertions.assertEquals(20,forumStatistics.getPosts());
        Assertions.assertEquals(10,forumStatistics.getComments());
        Assertions.assertEquals(20,forumStatistics.getPostsPerUser());
        Assertions.assertEquals(10,forumStatistics.getCommentsPerUser());
        Assertions.assertEquals(0,forumStatistics.getCommentsPerPost());
    }

    @Test
    void commentsMoreThanPosts() {
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> users = new ArrayList<>();
        users.add("Julia");
        users.add("Aleksandra");
        int posts = 7;
        int comments = 20;

        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postCount()).thenReturn(posts);
        when(statisticsMock.commentCount()).thenReturn(comments);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(2, forumStatistics.getUsers());
        Assertions.assertEquals(7, forumStatistics.getPosts());
        Assertions.assertEquals(20, forumStatistics.getComments());
        Assertions.assertEquals(3, forumStatistics.getPostsPerUser());
        Assertions.assertEquals(10, forumStatistics.getCommentsPerUser());
        Assertions.assertEquals(2, forumStatistics.getCommentsPerPost());
    }

    @Test
    void usersEquals0(){
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> users = new ArrayList<>();
        int posts = 250;
        int comments = 50;

        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postCount()).thenReturn(posts);
        when(statisticsMock.commentCount()).thenReturn(comments);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, forumStatistics.getUsers());
        Assertions.assertEquals(250, forumStatistics.getPosts());
        Assertions.assertEquals(50, forumStatistics.getComments());
        Assertions.assertEquals(0, forumStatistics.getPostsPerUser());
        Assertions.assertEquals(0, forumStatistics.getCommentsPerUser());
        Assertions.assertEquals(0.2, forumStatistics.getCommentsPerPost(),000);
    }

    @Test
    void usersEquals100(){
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> users = new ArrayList<>();
        for(int i=0; i<100; i++) {
            users.add("Users");
        }
        int posts = 100;
        int comments = 250;

        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postCount()).thenReturn(posts);
        when(statisticsMock.commentCount()).thenReturn(comments);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(100, forumStatistics.getUsers());
        Assertions.assertEquals(100, forumStatistics.getPosts());
        Assertions.assertEquals(250, forumStatistics.getComments());
        Assertions.assertEquals(1, forumStatistics.getPostsPerUser());
        Assertions.assertEquals(2, forumStatistics.getCommentsPerUser());
        Assertions.assertEquals(2.5,forumStatistics.getCommentsPerPost(),000);

    }
}
