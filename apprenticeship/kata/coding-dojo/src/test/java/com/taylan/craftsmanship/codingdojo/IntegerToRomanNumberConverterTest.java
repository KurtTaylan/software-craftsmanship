package com.taylan.craftsmanship.codingdojo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegerToRomanNumberConverterTest {


    @Test
    public void convert_1_2_3() throws Exception {
        IntegerToRomanNumberConverter converter = new IntegerToRomanNumberConverter();
        assertThat(converter.convert(1)).isEqualTo("I");
        assertThat(converter.convert(2)).isEqualTo("II");
        assertThat(converter.convert(3)).isEqualTo("III");
    }
}
