package com.kodilla.spring.intro.shape;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DrawerTestSuite {

//    @Test
//    void testDoDrawing() {
//        //Given
//        Drawer drawer = new Drawer(new Shape ());
//
//        //When
//        drawer.doDrawing();
//
//        //Then
//    }


    @Test
    void testDoDrawingWithCircle() {
        //Given
        Circle circle = new Circle();

        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();

        //Then
        assertEquals("This is a circle", result);

    }

    @Test
    void testDrawingWithTriangle() {
        //Given
        Triangle triangle = new Triangle();

        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();

        //Then

        assertEquals("This is a triangle", result);
    }

    @Test
    void testDrawingWithSquare() {
        //Given
        Square square = new Square();

        //When
        Drawer drawer = new Drawer(square);
        String result = drawer.doDrawing();

        //Then
        assertEquals("This is a Square", result);

    }
}
