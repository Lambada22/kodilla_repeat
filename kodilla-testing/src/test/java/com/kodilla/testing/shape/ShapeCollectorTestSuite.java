package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: ShapeCollector Test")
public class ShapeCollectorTestSuite {
    @BeforeAll
    public static void begin() {
        System.out.println("This is beginning of the Test");
    }

    @AfterAll
    public static void finish() {
        System.out.println("This is the end, you know...");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("This is begin of the Test Case");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("This is the end of the Test Case");
    }

    @Nested
    @DisplayName("Figures Management")
    class FiguresManagement {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            //When
            Shape result = shapeCollector.addFigure(circle);
            //Then
            assertTrue(result.equals(circle));
        }
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            //When
            Shape ourCircle = shapeCollector.addFigure(circle);
            shapeCollector.removeFigure(ourCircle);
            //Then
            // assertFalse(shapeCollector.listOfFigures().contains(ourCircle));
            assertFalse(shapeCollector.shapes.contains(ourCircle));
        }
    }
    @Nested
    @DisplayName("Show Figures")
    class FiguresShow {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            Triangle triangle = new Triangle();
            Square square = new Square();
            //When
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(square);
            Shape result = shapeCollector.getFigure(2);
            //Then
            assertEquals(result, square);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(new Circle());
            shapeCollector.addFigure(new Triangle());
            shapeCollector.addFigure(new Square());

            String expected = "[Circle, Triangle, Square]";
            String result = shapeCollector.showFigures();
            //Then
            assertEquals(expected, result);
        }

    }


}