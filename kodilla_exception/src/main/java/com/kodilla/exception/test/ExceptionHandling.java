package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) throws Exception {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1.5, 2.0);
        } catch (Exception e) {
            throw new FiguresException();
        } finally {
            System.out.println("Second Challenge Handled");
        }

    }

}
