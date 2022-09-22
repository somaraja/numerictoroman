package com.example.numerictoroman;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class NumericToRomanConverter {

    private NumericToRomanConverter() {}

    public static String convertToRoman(int number) {

        Map<String, Integer> romanNumeralMap = new LinkedHashMap<>();
        romanNumeralMap.put("M", 1000);
        romanNumeralMap.put("CM", 900);
        romanNumeralMap.put("D", 500);
        romanNumeralMap.put("CD", 400);
        romanNumeralMap.put("C", 100);
        romanNumeralMap.put("XC", 90);
        romanNumeralMap.put("L", 50);
        romanNumeralMap.put("XL", 40);
        romanNumeralMap.put("X", 10);
        romanNumeralMap.put("IX", 9);
        romanNumeralMap.put("V", 5);
        romanNumeralMap.put("IV", 4);
        romanNumeralMap.put("I", 1);

        StringBuilder romanNumeralBuilder = new StringBuilder();

        if(number < 1) {
            return "Number should be > 0";
        } else {
            for (Map.Entry<String, Integer> entry : romanNumeralMap.entrySet()) {
                int numberOfTimes = number / entry.getValue();
                if (numberOfTimes > 0) {
                    romanNumeralBuilder.append(addRomanNumeralRepeatedly(entry.getKey(), numberOfTimes));
                }
                number = number % entry.getValue();
            }
            return romanNumeralBuilder.toString();
        }
    }

    private static String addRomanNumeralRepeatedly(String numeral, int times) {
        final StringBuilder builder = new StringBuilder();
        IntStream.rangeClosed(1, times).forEach(i -> builder.append(numeral));
        return builder.toString();
    }
}
