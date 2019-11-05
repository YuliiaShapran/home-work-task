package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsChecker {

    @Step
    public int countNumberOfWorld(String sentence) {

//        TODO implements result
        int result = 0;

//        if (sentence == null || sentence.isEmpty()) {
//            return 0;
//        }

        String[] words = sentence.split(" ");
        result = words.length;
        return result;
    }
}


