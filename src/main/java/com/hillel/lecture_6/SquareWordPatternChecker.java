package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {

//        TODO implements result
        String result = word;

        for (int i = 0; i < word.length() - 1 ; i++) {
            result = result + ", "; //   можно так же заюзать result = result.concat(", ")
            word = word.substring(1) + word.charAt(0); //word.substring(1) начинаем выводить со второго
            result += word;

        }
        return result;
    }


}
