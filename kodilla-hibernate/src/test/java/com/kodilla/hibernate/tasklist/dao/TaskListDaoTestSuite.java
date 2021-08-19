package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static final String DESCRIPTION = "Dangerous !!!";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("Animals",DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        Optional <TaskList> readTaskList =  taskListDao.findById(id);
        assertTrue(readTaskList.isPresent());

        //CleanUp
        taskListDao.deleteById(id);
    }
}
