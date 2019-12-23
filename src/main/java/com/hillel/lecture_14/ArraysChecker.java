package com.hillel.lecture_14;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by alpa on 12/5/19
 */
public class ArraysChecker {


    public List<String> getReversList(List<String> list) {

        //List<String> reverseView = Lists.reverse(list); implementation via reverse
        List<String> list1 = new ArrayList<>();
        for (String element: list) {
            list1.add(0, element);
        }
        System.out.println(list1);
        return list1;
    }

    public String getLongestString(List<String> list) {

        String result = "";
        int maxLength = 0;
        for (String element : list) {
            if (element.length() > maxLength) {
                maxLength = element.length();
                result = element;
            }
        }
        return result;
    }

    public List<String> changeIndex(List<String> list) {
            list.set(1, "Star Lord");
            list.set(3, "Captain America");

        return list;
    }

    public List<String> removeDuplicates(List<String> list) {
        List<String> list1 = new ArrayList<>();
        for (String element: list) {
            if(!list1.contains(element)) {
                list1.add(element);
            }
        }

        return list1;
    }

    public List<String> sortList(List<String> list) {
        Collections.sort(list);

        return list;
    }
}
