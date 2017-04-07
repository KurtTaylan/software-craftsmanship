package com.taylan.tdd;

/**
 * Entry Point to Application.
 *
 * @author Taylan Kurt
 */
public class RomanNumbersApplication {


    public String convertToRomanFrom(int number) {

        if (number == 10)
            return "X";
        else if (number == 5)
            return "V";
        else if (number == 3)
            return "III";
        else if (number == 2)
            return "II";
        else
            return "I";
    }
}
