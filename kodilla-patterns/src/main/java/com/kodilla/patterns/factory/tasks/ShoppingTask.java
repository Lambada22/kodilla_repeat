package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    String taskName;
    String whatToBuy;
    double quantity;
    boolean isExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity, boolean isExecuted) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.isExecuted = isExecuted;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }


    public void executeTask() {
        isExecuted = true;
    }

    public boolean isTaskExecuted() {
        return false;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }
}
