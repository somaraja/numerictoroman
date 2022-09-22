package com.example.numerictoroman;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NumericToRomanConverterTest {
    NumericToRomanConverter numericToRomanConverter;

    @Before
    public void eachTest() {
        numericToRomanConverter = new NumericToRomanConverter();
    }

    @Test
    public void testIsNumberIsZero() {
        assertEquals(numericToRomanConverter.convertToRoman(0), "Number should be one or more");
    }

    @Test
    public void testIsNumberIsLessThanZero() {
        assertEquals(numericToRomanConverter.convertToRoman(0), "Number should be one or more");
    }
}