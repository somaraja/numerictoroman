package com.example.numerictoroman;

import java.util.TreeMap;

public class NumericToRomanConverterUsingTreeMap {

    private NumericToRomanConverterUsingTreeMap() {}

    public static String convertToRoman(int number) {

        TreeMap<Integer, String> romanNumeralMap = new TreeMap<>();
        romanNumeralMap.put(1000, "M");
        romanNumeralMap.put(900, "CM");
        romanNumeralMap.put(500, "D");
        romanNumeralMap.put(400, "CD");
        romanNumeralMap.put(100, "C");
        romanNumeralMap.put(90, "XC");
        romanNumeralMap.put(50, "L");
        romanNumeralMap.put(40, "XL");
        romanNumeralMap.put(10, "X");
        romanNumeralMap.put(9, "IX");
        romanNumeralMap.put(5, "V");
        romanNumeralMap.put(4, "IV");
        romanNumeralMap.put(1, "I");

        StringBuilder romanNumeralBuilder = new StringBuilder();

        if(number < 1) {
            return "Number should be > 0";
        } else {
            while (number > 0) {
                int key = romanNumeralMap.floorKey(number);
                romanNumeralBuilder.append(romanNumeralMap.get(key));
                number -= key;
            }
            return romanNumeralBuilder.toString();
        }
    }
}
