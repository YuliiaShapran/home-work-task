package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class LinearEquationChecker {

    public int linearEquation(int a, int b) {

//        TODO implements result
        int result = 0;
        if (a != 0 && b != 0) {
            result = -b / a;
        } else {
            result = 0;
        }
        return result;
    }
}
