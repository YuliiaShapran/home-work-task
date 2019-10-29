package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";
        double discriminant = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(discriminant)) / 2 * a;
        double x2 = (-b - Math.sqrt(discriminant)) / 2 * a;;
        if(discriminant > 0 && a > 0 ){
            result = "Discriminant: " + discriminant + ", x1: " + x1 + ", x2: " + x2;
        } else if(discriminant < 0) {
            result = "No roots on the set of real numbers!";
        } else if(discriminant == 0) {
            result = "Two real, identical roots: [x1 && x2] = " + x1;
        } else if(a == 0){
            result = "The 'a' coefficient should not be zero!";
        } else result = "Final";
        return result;
    }

}
