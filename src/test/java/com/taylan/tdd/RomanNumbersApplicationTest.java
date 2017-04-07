package com.taylan.tdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Main Test
 */
public class RomanNumbersApplicationTest {


    @Test
    public void should_number_one_converted_roman_numeric() {
        int numberOne = 1;

        RomanNumbersApplication converter = new RomanNumbersApplication();
        String romanNumberResult = converter.convertToRomanFrom(numberOne);

        assertThat(romanNumberResult).isSameAs("I");

    }

    @Test
    public void should_number_two_converted_roman_numeric() throws Exception {
        int numberTwo = 2;

        RomanNumbersApplication converter = new RomanNumbersApplication();
        String romanNumberResult = converter.convertToRomanFrom(numberTwo);

        assertThat(romanNumberResult).isSameAs("II");
    }

    @Test
    public void should_number_three_converted_roman_numberic() throws Exception {
        int numberThree = 3;

        RomanNumbersApplication converter = new RomanNumbersApplication();
        String romanNumberResult = converter.convertToRomanFrom(numberThree);

        assertThat(romanNumberResult).isSameAs("III");
    }
}