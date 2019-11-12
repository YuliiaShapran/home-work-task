package com.hillel.lecture_7;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Write class to represent FractionNumbers
 * This class should contain two fields.
 * This class should contain methods to perform basic math operations:
 * plus, minus, multiply, divide
 * Also, this class should have toString method to print numbers into standard output
 * Add tests for check functionality of FractionNumber class
 */
public class FractionNumbersTestTask {

    FractionNumber fractionNumber = new FractionNumber(12.2d, 2.8d);
    double result;

    @Test
    public void toStringTest () {
        String expectedResult = "FractionNumber{numerator = 12.2, denominator = 2.8}";
        assertEquals(fractionNumber.toString(),expectedResult);
    }

    @Test
    public void FractionNumberPlusTest() {

        result = fractionNumber.plusOperation(fractionNumber.getNumerator(), fractionNumber.getDenominator());
        assertEquals(result, 15d);
    }

    @Test
    public void FractionNumberMinusTest() {

        result = fractionNumber.minusOperation(fractionNumber.getNumerator(), fractionNumber.getDenominator());
        assertEquals(result, 9.399999999999999d);
    }

    @Test
    public void FractionNumberMultiplyTest() {

        result = fractionNumber.multiplyOperation(fractionNumber.getNumerator(), fractionNumber.getDenominator());
        assertEquals(result, 34.16d);
    }

    @Test
    public void FractionNumberDivideTest() {

        result = fractionNumber.divideOperation(fractionNumber.getNumerator(), fractionNumber.getDenominator());
        assertEquals(result, 4.357142857142857D);

    }
}


