package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;
    boolean isExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint, boolean isExecuted) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isExecuted = isExecuted;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        isExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
