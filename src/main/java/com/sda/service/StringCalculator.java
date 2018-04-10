package com.sda.service;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class StringCalculator {
    public int calculate(String text) {

        String textWithoutWhitespaces = StringUtils.deleteWhitespace(text);
        String[] elements = StringUtils.split(textWithoutWhitespaces, ";");
        elements = elements == null ? new String[0] : elements;
        return Arrays.stream(elements)
                .mapToInt(e -> Integer.valueOf(e))
                .sum();

//        int result = 0;
//
//        for (String element : elements) {
//            result += Integer.valueOf(element);
//        }
//        return result;

//        return Integer.valueOf(elements[0] + Integer.valueOf(elements[1]));


    }

}
