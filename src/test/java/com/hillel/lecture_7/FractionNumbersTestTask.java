package com.hillel.lecture_7;

/**
 * Write class to represent FractionNumbers
 * This class should contain two fields.
 * This class should contain methods to perform basic math operations:
 * plus, minus, multiply, divide
 * Also, this class should have toString method to print numbers into standard output
 * Add tests for check functionality of FractionNumber class
 */
public class FractionNumbersTestTask {
    public static void main(String[] args) {
        FractionNumber fractionNumber = new FractionNumber(12.236, 2.8);
        double result;

//        fractionNumber.setNumerator(10.2);
//        fractionNumber.setDenominator(2.7);

        System.out.println(fractionNumber.toString());

        result = fractionNumber.plusOperation(fractionNumber.getNumerator(), fractionNumber.getDenominator());
        System.out.println(result);

        result = fractionNumber.minusOperation(fractionNumber.getNumerator(), fractionNumber.getDenominator());
        System.out.println(result);

        result = fractionNumber.multiplyOperation(fractionNumber.getNumerator(), fractionNumber.getDenominator());
        System.out.println(result);

        result = fractionNumber.divideOperation(fractionNumber.getNumerator(), fractionNumber.getDenominator());
        System.out.println(result);

    }

}
