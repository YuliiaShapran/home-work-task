package com.hillel.lecture_2;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    public double calculate9Formula(double x) {
        double result = 0.0;
        result = 1.1 * Math.exp(-x) + Math.abs(Math.cos(Math.sqrt(Math.PI * x))) - (3D/8D);
//        TODO implement formula 9
        return result;
    }

    public double calculate10Formula(double x) {
        double result = 0.0;
//        TODO implement formula 10
        result = 1d/3d * Math.sqrt(Math.abs(Math.sin(x))) * Math.cbrt(Math.exp(0.12 * x));
        return result;
    }

    public double calculate11Formula(double x) {
        double result = 0.0;
//        TODO implement formula 11
        result = 2 * Math.PI * x - Math.abs(Math.sin(Math.sqrt(10.5D * x))) * 1/((Math.cbrt(Math.pow(x, 2)) + 1D/7D));
        return result;
    }

    public double calculate12Formula(double x) {
        double result = 0.0;
//        TODO implement formula 12
        result = Math.log(Math.sqrt(Math.abs(2 - x)) + 1.2D) * 1 / (2 + Math.exp(-x)) + Math.cbrt(2/x);
        return result;
    }

    public double calculate13Formula(double x) {
        double result = 0.0;
//        TODO implement formula 13
        double a = Math.exp(-2d + x);
        result = Math.pow(a, 1d/5d) * 1 / Math.sqrt(Math.pow(x, 2) + Math.pow(x, 4) + Math.log(Math.abs(x - Math.PI)));
        return result;
    }
}
