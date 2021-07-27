package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private  static Logger logger;

    @BeforeAll
    public static void start() {
        System.out.println("Starting");
        logger = Logger.INSTANCE;
        logger.log("Dawid");
    }

    @AfterAll
    public static void closeSettingsFile() {

        System.out.println("Finished");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String log = logger.getLastLog();

        //Then
        assertEquals("Dawid", log);
    }
}
