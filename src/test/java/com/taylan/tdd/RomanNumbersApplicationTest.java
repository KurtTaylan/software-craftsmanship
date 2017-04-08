package com.taylan.tdd;

import com.taylan.tdd.service.Converter;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.StringStartsWith.startsWith;

/**
 * Abstraction: Test Class aims to test to converter which converts arabic numbers to roman ones.
 *
 * Notes:
 * Test Coverage: 100 %
 * FIXME: Unit and Component Tests are together.
 */
public class RomanNumbersApplicationTest {


    private RomanNumbersApplication converterApplication;

    @Rule
    public ExpectedException thrown = ExpectedException.none();



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
    public void should_number_400_converted_roman_numberic_CD() throws Exception {
        int inputNumber = 400;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("CD");
    }

    @Test
    public void should_number_500_converted_roman_numberic_D() throws Exception {
        int inputNumber = 500;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("D");
    }

    @Test
    public void should_number_900_converted_roman_numberic_CM() throws Exception {
        int inputNumber = 900;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("CM");
    }

    @Test
    public void should_number_1903_converted_roman_numberic_MCMIII() throws Exception {
        int inputNumber = 1903;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("MCMIII");
    }

    @Test
    public void should_number_3000_converted_roman_numberic_MMM() throws Exception {
        int inputNumber = 3000;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("MMM");
    }

    @Test
    public void should_number_2999_converted_roman_numberic_MMCMXCIX() throws Exception {
        int inputNumber = 2999;
        String romanNumberResult = converterApplication.runConverter(inputNumber);

        assertThat(romanNumberResult).isEqualTo("MMCMXCIX");
    }

   // Exception Tests
    @Test
    public void should_throw_illegal_argument_exception_because_over_limit_3000(){
        int inputNumber = 4000;
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(startsWith("This number is beyond than application scope !"));

        String romanNumberResult = converterApplication.runConverter(inputNumber);
    }

    @Test
    public void should_throw_illegal_argument_exception_because_invalid_input() throws Exception {
        int inputNumber = -1;
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(startsWith("Invalid Number."));

        String romanNumberResult = converterApplication.runConverter(inputNumber);

    }

    @Test
    public void should_converter_throw_illegal_argument_exception_because_invalid_input() throws Exception {
        int inputNumber = 999999999;
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(startsWith("You tried to reach roman number not in our dictionary."));

        Converter converter = new Converter();
        String romanNumberResult = converter.getRomanNumber(inputNumber);
    }
}