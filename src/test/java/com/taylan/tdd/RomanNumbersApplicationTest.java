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

        assertThat(romanNumberResult).isSameAs("I");

    }

    @Test
    public void should_number_two_converted_roman_numeric_II() throws Exception {
        int numberTwo = 2;

        RomanNumbersApplication converter = new RomanNumbersApplication();
        String romanNumberResult = converter.convertToRomanFrom(numberTwo);

        assertThat(romanNumberResult).isSameAs("II");
    }

    @Test
    public void should_number_three_converted_roman_numberic_III() throws Exception {
        int numberThree = 3;

        RomanNumbersApplication converter = new RomanNumbersApplication();
        String romanNumberResult = converter.convertToRomanFrom(numberThree);

        assertThat(romanNumberResult).isSameAs("III");
    }

    @Test
    public void should_number_five_converted_roman_numberic_V() throws Exception {
        int numberFive = 5;

        RomanNumbersApplication converter = new RomanNumbersApplication();
        String romanNumberResult = converter.convertToRomanFrom(numberFive);

        assertThat(romanNumberResult).isSameAs("V");

    }

    @Test
    public void should_number_ten_converted_roman_numberic_X() throws Exception {
        int numberTen = 10;

        RomanNumbersApplication converter = new RomanNumbersApplication();
        String romanNumberResult = converter.convertToRomanFrom(numberTen);

        assertThat(romanNumberResult).isSameAs("X");
    }
}