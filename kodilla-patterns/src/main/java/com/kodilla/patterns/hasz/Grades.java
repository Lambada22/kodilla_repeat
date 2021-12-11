package com.kodilla.patterns.hasz;

public class Grades {
    private double mathGrade;
    private double ItGrade;
    private double englishGrade;
    private double chemistryGrade;
    private double sumOfGrades;

    public Grades(double mathGrade, double itGrade, double englishGrade, double chemistryGrade) {
        this.mathGrade = mathGrade;
        ItGrade = itGrade;
        this.englishGrade = englishGrade;
        this.chemistryGrade = chemistryGrade;
    }

    public double getSumOfGrades() {
        return getChemistryGrade() + getMathGrade() + getItGrade() + getEnglishGrade();
    }

    public double getAverageOfGrades() {
        return getSumOfGrades() / 4;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "mathGrade=" + mathGrade +
                ", ItGrade=" + ItGrade +
                ", englishGrade=" + englishGrade +
                ", chemistryGrade=" + chemistryGrade +
                '}';
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getItGrade() {
        return ItGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public double getChemistryGrade() {
        return chemistryGrade;
    }
}
