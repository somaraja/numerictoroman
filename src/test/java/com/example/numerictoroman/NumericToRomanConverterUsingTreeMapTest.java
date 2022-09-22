package com.example.numerictoroman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumericToRomanConverterUsingTreeMapTest {
    @Test
    public void testIsNumberZero() {
        assertEquals("Number should be > 0", NumericToRomanConverterUsingTreeMap.convertToRoman(0));
    }

    @Test
    public void testIsNumberLessThanZero() {
        assertEquals("Number should be > 0", NumericToRomanConverterUsingTreeMap.convertToRoman(0));
    }

    @Test
    public void testConvert1ToRoman() {
        assertEquals("I", NumericToRomanConverterUsingTreeMap.convertToRoman(1));
    }

    @Test
    public void testConvert3ToRoman() {
        assertEquals("III", NumericToRomanConverterUsingTreeMap.convertToRoman(3));
    }

    @Test
    public void testConvert5ToRoman() {
        assertEquals("V", NumericToRomanConverterUsingTreeMap.convertToRoman(5));
    }

    @Test
    public void testConvert10ToRoman() {
        assertEquals("X", NumericToRomanConverterUsingTreeMap.convertToRoman(10));
    }

    @Test
    public void testConvert50ToRoman() {
        assertEquals("L", NumericToRomanConverterUsingTreeMap.convertToRoman(50));
    }

    @Test
    public void testConvert55ToRoman() {
        assertEquals("LV", NumericToRomanConverterUsingTreeMap.convertToRoman(55));
    }

    @Test
    public void testConvert99ToRoman() {
        assertEquals("XCIX", NumericToRomanConverterUsingTreeMap.convertToRoman(99));
    }

    @Test
    public void testConvert100ToRoman() {
        assertEquals("C", NumericToRomanConverterUsingTreeMap.convertToRoman(100));
    }

    @Test
    public void testConvert500ToRoman() {
        assertEquals("D", NumericToRomanConverterUsingTreeMap.convertToRoman(500));
    }

    @Test
    public void testConvert1000ToRoman() {
        assertEquals("M", NumericToRomanConverterUsingTreeMap.convertToRoman(1000));
    }

    @Test
    public void testConvert1875ToRoman() {
        assertEquals("MDCCCLXXV", NumericToRomanConverterUsingTreeMap.convertToRoman(1875));
    }

    @Test
    public void testConvert2475ToRoman() {
        assertEquals("MMCDLXXV", NumericToRomanConverterUsingTreeMap.convertToRoman(2475));
    }

    @Test
    public void testConvert3000ToRoman() {
        assertEquals("MMM", NumericToRomanConverterUsingTreeMap.convertToRoman(3000));
    }

}