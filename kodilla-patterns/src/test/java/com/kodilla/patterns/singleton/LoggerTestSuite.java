package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

   // private static Logger logger;

    @Test
    void shouldGetLastLog() {
        Logger logger = Logger.getInstance();
        logger.log("Our Text!");

        String result = logger.getLastLog();

        assertEquals(result, "Our Text!");
    }


//    @BeforeAll
//    public static  void startLog(){
//        logger= new Logger(logger.getLastLog(),logger.getNextLog(),logger.getAnotherLog());
//        //logger = Logger.LOG;
//        //logger.log("log", "log2", "log3");
//    }

//    @Test
//    void testLogging() {
//        //Given
//        String l1 = logger.getLastLog();
//        String l2 = logger.getNextLog();
//        String l3 = logger.getAnotherLog();
//
//        //When
//        //String xyz =
//        logger.log(l1, l2, l3);
//
//        //Then
//        assertEquals(l1,logger.getLastLog());
//
//
//    }

//    @Test
//    void testGetLastLog() {
//        //Given
//        String result = logger.getLastLog();
//
//        //When
//
//
//        //Then
//        assertEquals(result, "Log: [" + logger.getLastLog() + "]");
//
//    }

}
