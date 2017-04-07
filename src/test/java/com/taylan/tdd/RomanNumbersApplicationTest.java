package com.taylan.tdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumbersApplicationTest {

    @Test
    public void testNothing() throws Exception {

    }

    @Test
    public void should_number_one_converted_roman_numeric() {
        int numberOne = 1;
        RomanNumbersApplication converter = new RomanNumbersApplication();

        String romanNumberResult = converter.convertToRomanFrom(numberOne);

        assertThat(romanNumberResult).isSameAs("I");

    }



}