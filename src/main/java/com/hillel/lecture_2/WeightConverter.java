package com.hillel.lecture_2;

/**
 * Created by alpa on 10/17/19
 */
public class WeightConverter {

    public double kilogramsToPounds(double kilograms) {
//        TODO implements result
        double result = kilograms * 2.20462D;
        return result;
    }

    public double poundsToKilograms(double pounds) {
//        TODO implements result
        double result = pounds / 2.2046D;
        return result;
    }

}
