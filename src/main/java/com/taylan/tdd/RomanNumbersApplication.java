package com.taylan.tdd;

import com.taylan.tdd.service.Converter;

/**
 * Entry Point to Application.
 *
 * @author Taylan Kurt
 */
public class RomanNumbersApplication {

    private Converter converter;

    public RomanNumbersApplication() {
        this.converter = new Converter();
    }

    public String runConverter(int inputValue) {
        String output = "";
        String numberInString = "" + inputValue;

        for (int positionCounter = 1; positionCounter < numberInString.length() + 1; positionCounter++) {
            int digit = Character.getNumericValue(numberInString.charAt(positionCounter - 1));
            int value = numberInString.length() - ( positionCounter - 1 );

            for (int i = 1; i < value; i ++)
                digit *= 10;

            String tempVa = converter.convertToRomanFrom(digit);
            output += tempVa;
        }

        return output;
    }
}
