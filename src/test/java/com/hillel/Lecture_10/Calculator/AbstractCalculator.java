package com.hillel.Lecture_10.Calculator;

public abstract class AbstractCalculator {

    public abstract void additionOperation();

    public abstract void subtractionOperation();

    public abstract void multiplicationOperation();

    public abstract void divisionOperation();

    public void exponentiationOperation(int a, int b) { //common method for all classes (not abstract!)
        double result = Math.pow(a, b);
        System.out.println(result);
    }

}
