package com.hillel.Lecture_10.Calculator;


public class ProgrammableCalculator extends AbstractCalculator {
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

    public void checkDivisorOperation(int divisor, int number) {

        if ((number % divisor) == 0) {
            System.out.println("The number " + divisor + " is divisor of the number " + number);
        } else {
            System.out.println("The number " + divisor + " is not divisor of the number " + number);
        }
    }
}
