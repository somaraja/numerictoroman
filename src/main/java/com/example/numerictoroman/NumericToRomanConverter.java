package com.example.numerictoroman;

public class NumericToRomanConverter {

    private NumericToRomanConverter() {}

    public static String convertToRoman(int number) {
        if (number < 1) {
            return "Number should be one or more";
        } else if (number == 1000) {
            return "M";
        } else if (number == 500) {
            return "D";
        } else if (number == 100) {
            return "C";
        } else if (number == 50) {
            return "L";
        } else if (number == 10) {
            return "X";
        } else if (number == 5) {
            return "V";
        } else {
            return "I";
        }
    }
}
