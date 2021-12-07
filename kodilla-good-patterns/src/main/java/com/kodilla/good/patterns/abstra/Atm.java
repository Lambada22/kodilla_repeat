package com.kodilla.good.patterns.abstra;

public class Atm extends Bank {
    protected void putYourCard() {
        System.out.println("Please Put Your Card to the ATM");
    }

    protected void pin() {
        System.out.println("Type Your PIN please");
    }

    protected void amount() {
        System.out.println("Your account level is: ");
    }

    protected void withdraw() {
        System.out.println("You can Withdraw Money from Your account");
    }

    protected void thx() {
        System.out.println("Thank You for Your coop. Come Again ! ;)");
    }

    @Override
    public void run() {
        this.putYourCard();
        this.pin();
        this.amount();
        this.withdraw();
        this.thx();
    }
}
