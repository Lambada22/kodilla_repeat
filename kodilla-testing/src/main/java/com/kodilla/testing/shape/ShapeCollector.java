package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapes = new ArrayList<>();

    Shape addFigure(Shape shape) {
        shapes.add(shape);
        return shape;
    }

    void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        List<String> names = new ArrayList<>();
        for (Shape ourShape : shapes) {
            names.add(ourShape.getShapeName());
        }
        return names.toString();
    }

}