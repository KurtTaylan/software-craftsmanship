package com.taylan.craftsmanship.bowlinggame;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegerToRomanNumberConverterTest {

    private IntegerToRomanNumberConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new IntegerToRomanNumberConverter();
    }

    @Test
    public void convert_1_2_3() throws Exception {
        assertThat(converter.convert(1)).isEqualTo("I");
        assertThat(converter.convert(2)).isEqualTo("II");
        assertThat(converter.convert(3)).isEqualTo("III");
    }

    @Test
    public void convert_5_10() throws Exception {
        assertThat(converter.convert(5)).isEqualTo("V");
        assertThat(converter.convert(10)).isEqualTo("X");
    }

    @Test
    public void convert_4_9() throws Exception {
        assertThat(converter.convert(4)).isEqualTo("IV");
        assertThat(converter.convert(9)).isEqualTo("IX");
    }

    @Test
    public void convert_6_7_8() throws Exception {
        assertThat(converter.convert(6)).isEqualTo("VI");
        assertThat(converter.convert(7)).isEqualTo("VII");
        assertThat(converter.convert(8)).isEqualTo("VIII");
    }

    @Test
    public void convert_11_12_13() throws Exception {
        assertThat(converter.convert(11)).isEqualTo("XI");
        assertThat(converter.convert(12)).isEqualTo("XII");
        assertThat(converter.convert(13)).isEqualTo("XIII");
    }


    @Test
    public void convert_40_90() throws Exception {
        assertThat(converter.convert(40)).isEqualTo("XL");
        assertThat(converter.convert(90)).isEqualTo("XC");
    }

    @Test
    public void convert_400_900() throws Exception {
        assertThat(converter.convert(400)).isEqualTo("CD");
        assertThat(converter.convert(900)).isEqualTo("CM");
    }
}