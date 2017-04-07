package com.taylan.tdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Main Test
 */
public class RomanNumbersApplicationTest {


    @Test
    public void should_number_one_converted_roman_numeric_I() {
        int numberOne = 1;

        RomanNumbersApplication converter = new RomanNumbersApplication();
        String romanNumberResult = converter.convertToRomanFrom(numberOne);

        assertThat(romanNumberResult).isEqualTo("I");

    }

    @Test
    public void should_number_two_converted_roman_numeric_II() throws Exception {
        int numberTwo = 2;

        RomanNumbersApplication converter = new RomanNumbersApplication();
        String romanNumberResult = converter.convertToRomanFrom(numberTwo);

        assertThat(romanNumberResult).isEqualTo("II");
    }

    @Test
    public void should_number_three_converted_roman_numeric_III() throws Exception {
        int numberThree = 3;

        RomanNumbersApplication converter = new RomanNumbersApplication();
        String romanNumberResult = converter.convertToRomanFrom(numberThree);

        assertThat(romanNumberResult).isEqualTo("III");
    }

    @Test
    public void should_number_five_converted_roman_numeric_V() throws Exception {
        int numberFive = 5;

        RomanNumbersApplication converter = new RomanNumbersApplication();
        String romanNumberResult = converter.convertToRomanFrom(numberFive);

        assertThat(romanNumberResult).isEqualTo("V");

    }

    @Test
    public void should_number_ten_converted_roman_numeric_X() throws Exception {
        int numberTen = 10;

        RomanNumbersApplication converter = new RomanNumbersApplication();
        String romanNumberResult = converter.convertToRomanFrom(numberTen);

        assertThat(romanNumberResult).isEqualTo("X");
    }

    @Test
    public void should_number_six_converted_roman_numeric_VI() throws Exception {
        int numberSix = 6;

        RomanNumbersApplication converter = new RomanNumbersApplication();
        String romanNumberResult = converter.convertToRomanFrom(numberSix);

        assertThat(romanNumberResult).isEqualTo("VI");
    }

    @Test
    public void should_number_four_converted_roman_numeric_IV() throws Exception {
        int numberSix = 4;

        RomanNumbersApplication converter = new RomanNumbersApplication();
        String romanNumberResult = converter.convertToRomanFrom(numberSix);

        assertThat(romanNumberResult).isEqualTo("IV");
    }
}