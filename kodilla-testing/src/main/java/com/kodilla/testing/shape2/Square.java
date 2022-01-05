package com.kodilla.testing.shape2;

public class Square implements Shape {
    public String getShapeName(){
        return "This is a Square";
    }

    @Override
    public double getField() {
        return 0;
    }
}
