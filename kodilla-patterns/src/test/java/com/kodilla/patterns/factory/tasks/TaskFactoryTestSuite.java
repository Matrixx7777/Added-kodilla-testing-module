package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    public void testTaskShop(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.makeTask(TaskFactory.SHOP);

        //Then
        assertEquals("Go to shop and buy -> " + "knifs", task.executeTask());
        assertEquals("We need to use -> " + "Kitchen things", task.getTaskName());
        assertEquals(true, task.isTaskExecuted());

    }

    @Test
    public void testTaskPaint(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.makeTask(TaskFactory.PAINT);

        //Then
        assertEquals("Draw this on the picture -> " + "picture", task.executeTask());
        assertEquals("We need to use -> " + "brush", task.getTaskName());
        assertEquals(true, task.isTaskExecuted());

    }

    @Test
    public void testTaskDrive(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.makeTask(TaskFactory.DRIVE);

        //Then
        assertEquals("Driving to -> " + "20 warszawska" + " street", task.executeTask());
        assertEquals("Our car has a mark -> " + "BMW", task.getTaskName());
        assertEquals(false, task.isTaskExecuted());

    }
}
