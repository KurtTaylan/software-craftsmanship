package com.taylan.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Initial Test Class
 */
public class RomanNumbersApplicationTest {


    private RomanNumbersApplication converterApplication;


    @Before
    public void tearUp() {
        converterApplication = new RomanNumbersApplication();
    }


    @Test
    public void should_number_1_converted_roman_numeric_I() {
        int inputNumber = 1;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("I");
    }

    @Test
    public void should_number_2_converted_roman_numeric_II() throws Exception {
        int inputNumber = 2;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("II");
    }

    @Test
    public void should_number_3_converted_roman_numeric_III() throws Exception {
        int inputNumber = 3;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("III");
    }

    @Test
    public void should_number_5_converted_roman_numeric_V() throws Exception {
        int inputNumber = 5;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("V");
    }

    @Test
    public void should_number_10_converted_roman_numeric_X() throws Exception {
        int inputNumber = 10;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("X");
    }

    @Test
    public void should_number_6_converted_roman_numeric_VI() throws Exception {
        int inputNumber = 6;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("VI");
    }

    @Test
    public void should_number_4_converted_roman_numeric_IV() throws Exception {
        int inputNumber = 4;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("IV");
    }

    @Test
    public void should_number_50_converted_roman_numeric_L() throws Exception {
        int inputNumber = 50;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("L");
    }

    @Test
    public void should_number_43_converted_roman_numberic_XLIII() throws Exception {
        int inputNumber = 43;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("XLIII");
    }

    @Test
    public void should_number_1903_converted_roman_numberic_MCMIII() throws Exception {
        int inputNumber = 1903;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("MCMIII");

    }
}