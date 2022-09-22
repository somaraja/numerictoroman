package com.example.numerictoroman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumericToRomanConverterTest {
    @Test
    public void testIsNumberZero() {
        assertEquals("Number should be > 0", NumericToRomanConverter.convertToRoman(0));
    }

    @Test
    public void testIsNumberLessThanZero() {
        assertEquals("Number should be > 0", NumericToRomanConverter.convertToRoman(0));
    }

    @Test
    public void testConvert1ToRoman() {
        assertEquals("I", NumericToRomanConverter.convertToRoman(1));
    }

    @Test
    public void testConvert3ToRoman() {
        assertEquals("III", NumericToRomanConverter.convertToRoman(3));
    }

    @Test
    public void testConvert5ToRoman() {
        assertEquals("V", NumericToRomanConverter.convertToRoman(5));
    }

    @Test
    public void testConvert10ToRoman() {
        assertEquals("X", NumericToRomanConverter.convertToRoman(10));
    }

    @Test
    public void testConvert50ToRoman() {
        assertEquals("L", NumericToRomanConverter.convertToRoman(50));
    }

    @Test
    public void testConvert55ToRoman() {
        assertEquals("LV", NumericToRomanConverter.convertToRoman(55));
    }

    @Test
    public void testConvert99ToRoman() {
        assertEquals("XCIX", NumericToRomanConverter.convertToRoman(99));
    }

    @Test
    public void testConvert100ToRoman() {
        assertEquals("C", NumericToRomanConverter.convertToRoman(100));
    }

    @Test
    public void testConvert500ToRoman() {
        assertEquals("D", NumericToRomanConverter.convertToRoman(500));
    }

    @Test
    public void testConvert1000ToRoman() {
        assertEquals("M", NumericToRomanConverter.convertToRoman(1000));
    }

    @Test
    public void testConvert1875ToRoman() {
        assertEquals("MDCCCLXXV", NumericToRomanConverter.convertToRoman(1875));
    }

    @Test
    public void testConvert2475ToRoman() {
        assertEquals("MMCDLXXV", NumericToRomanConverter.convertToRoman(2475));
    }

    @Test
    public void testConvert3000ToRoman() {
        assertEquals("MMM", NumericToRomanConverter.convertToRoman(3000));
    }

}