package com.kodilla.testing.shape2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("TDD: ShapeCollector Test")
public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure() {
        //Given
        Shape shape = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(shape);
        shape.getShapeName();
        //Then
        Assertions.assertTrue(shapeCollector.figures.contains(shape));
    }

    @Test
    public void testDeleteFigure() {
        //Given
        Shape circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.figures.add(circle);
        //Then
        Assertions.assertTrue(shapeCollector.figures.contains(circle));
        shapeCollector.removeFigure(circle);
        assertEquals(0, shapeCollector.figures.size());
    }

    @Test
    public void getFigureTest() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        Shape circle = shapeCollector.addFigure(new Circle());
        Shape triangle = shapeCollector.addFigure(new Triangle());
        Shape square = shapeCollector.addFigure(new Square());
        Shape ourFigure = shapeCollector.getFigure(2);
        //Then
        assertEquals(ourFigure, square);
    }

    @Test
    public void showFiguresTest() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = shapeCollector.addFigure(new Circle());
        Shape triangle = shapeCollector.addFigure(new Triangle());
        Shape square = shapeCollector.addFigure(new Square());
        //When
        String result = shapeCollector.showFigures();
        String figureNames = "[This is a Circle" + ", " + "This is a Triangle" + ", " + "This is a Square]";
        //Then
        assertEquals(result, figureNames);
    }


}
