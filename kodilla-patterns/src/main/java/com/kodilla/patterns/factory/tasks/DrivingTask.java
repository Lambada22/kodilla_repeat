package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;
    boolean isExecuted = false;

    public DrivingTask(String taskName, String where, String using, boolean isExecuted) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isExecuted = isExecuted;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        isExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}
