package com.kodilla.testing.shape2;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> figures = new ArrayList<>();


    public Shape addFigure(Shape shape) {
        figures.add(shape);
        return shape;
    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }

    public Shape getFigure(int n) {
        return figures.get(n);
    }

    public String showFigures() {
        List<String> names = new ArrayList<>();
        for (Shape ourShape : figures) {
            names.add(ourShape.getShapeName());
        }
        return names.toString();
    }
}
