package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {

//        TODO implements result
        int result = 0;
        sentence = sentence.replace(",", "").replace(".", "");
        String[] splittedSentence = sentence.split(" ");

        for (String newSentence : splittedSentence) {
            if (newSentence.length() == wordLength) {
                result = result + 1;
            }

        } return result;
    }
}


