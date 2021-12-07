package com.kodilla.good.patterns.abstra;

public abstract class Bank {

    abstract protected void putYourCard();

    abstract protected void pin();

    abstract protected void amount();

    private void demandReceive() {
        System.out.println("Bank Got Your Demand");
    }

    protected void accountCheck() {
        System.out.println("Checking Your Account State");
    }

    protected void withdrawConfirmation() {
        System.out.println("You Can Withdraw Your Money");
    }

    abstract protected void withdraw();

    abstract protected void thx();

    public void run() {
        this.putYourCard();
        this.pin();
        this.amount();
        this.demandReceive();
        this.accountCheck();
        this.withdrawConfirmation();
        this.withdraw();
        this.thx();
    }
}
