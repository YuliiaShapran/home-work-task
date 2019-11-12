package com.hillel.lecture_7;

/**
 * Created by alpa on 11/8/19
 */
public class FractionNumber {
    private double numerator;
    private double denominator;

    public double getNumerator() {
        return numerator;
    }

//    public void setNumerator(double numerator) {
//        this.numerator = numerator;
//    }

    public double getDenominator() {
        return denominator;
    }

//    public void setDenominator(double denominator) {
//        this.denominator = denominator;
//    }

    public FractionNumber() {

    }

    public FractionNumber(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "FractionNumber{" +
                "numerator = " + numerator +
                ", denominator = " + denominator +
                '}';

    }

    public double plusOperation(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
            return numerator + denominator;
        }


    public double minusOperation(double numerator, double denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        return numerator - denominator;
    }

    public double multiplyOperation(double numerator, double denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        return numerator * denominator;
    }

    public double divideOperation(double numerator, double denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        return numerator / denominator;
    }


}
