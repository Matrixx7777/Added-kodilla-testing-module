package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String a1 = "To do list";
        String a2 = "In progress list";
        String a3 = "Done list";
        board.getToDoList().getTasks().add(a1);
        board.getInProgressList().getTasks().add(a2);
        board.getDoneList().getTasks().add(a3);

        //Then
        Assertions.assertEquals(a1, board.getToDoList().getTasks().get(0));
        Assertions.assertEquals(a2, board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals(a3, board.getDoneList().getTasks().get(0));
    }
}
