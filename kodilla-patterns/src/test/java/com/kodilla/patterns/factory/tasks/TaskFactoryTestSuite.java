package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.executeTask(TaskFactory.SHOPPING);
        String name = shopping.getTaskName();
        boolean isFinished = shopping.isTaskExecuted();
        //  String item= ShoppingTask.class.;

        //Then
        assertEquals("Shopping!", name);
        assertEquals(false, isFinished);
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.executeTask(TaskFactory.PAINTING);
        String name = painting.getTaskName();
        boolean color = painting.isTaskExecuted();


        //Then
        String actual = "Painting!";
        assertEquals(name, actual);
        assertFalse(color);
    }

    @Test
    void testFactoryDrive() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.executeTask(TaskFactory.DRIVING);
        String name = driving.getTaskName();
        boolean isSucceeded = driving.isTaskExecuted();


        //Then
        assertEquals(name, "Deliver Passengers!");
        assertTrue(!isSucceeded);

    }
}
