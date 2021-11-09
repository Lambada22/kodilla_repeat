package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING TASK";
    public static final String PAINTING = "PAINTING TASK";
    public static final String DRIVING = "DRIVING TASK";

    public final Task executeTask(final String kindOfTask) {
        switch (kindOfTask) {
            case SHOPPING:
                return new ShoppingTask("Shopping!", "Bread", 2, false);
            case PAINTING:
                return new PaintingTask("Painting!", "Blue", "Fence", false);
            case DRIVING:
                return new DrivingTask("Deliver Passengers!", "Krakow", "Bus", false);
            default:
                return null;
        }
    }

}
