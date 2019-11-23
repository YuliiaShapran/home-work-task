package com.hillel.Lecture_10.Calculator;

public class AccountingCalculator extends AbstractCalculator {
    double firstNumber = 345.74;
    double secondNumber = 43.344;
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

    public void roundOperation(double number){
        result = Math.round(number);
        System.out.println(result);
    }

}
