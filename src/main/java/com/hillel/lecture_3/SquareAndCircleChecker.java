package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        double d = Math.sqrt(circleArea / Math.PI) * 2; // диаметр круга
        double diag = Math.sqrt(squareArea); // диагональ квадрата
        if(diag > d) {
            result = "The circle is in the square";
        }
        else {
            result = "The circle is not in the square";
        }
        return result;
    }

    @Step
    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        double d = Math.sqrt(circleArea / Math.PI) * 2; // диаметр круга
        double diag = Math.sqrt(squareArea); // диагональ квадрата
        double r = Math.sqrt(2 * diag * diag);
        if(r < d) {
            result = "The square is in the circle";
        }
        else {
            result = "The square is not in the circle";
        }
        return result;
    }

}
