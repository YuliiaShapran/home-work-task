package com.hillel.Lecture_10.Calculator;

public class SimpleCalculator extends AbstractCalculator {
    double firstNumber = 17.5;
    double secondNumber = 12.3;
    double result;

    @Override
    public void additionOperation() {
        System.out.println(result = firstNumber + secondNumber);
    }

    @Override
    public void subtractionOperation() {
        System.out.println(result = firstNumber - secondNumber);
    }

    @Override
    public void multiplicationOperation() {
        System.out.println(result = firstNumber * secondNumber);
    }

    @Override
    public void divisionOperation() {
        System.out.println(result = firstNumber / secondNumber);
    }


    public void squareRootExtraction(int number){
        result = Math.sqrt(number);
        System.out.println(result);
    }
}
