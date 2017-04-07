package com.taylan.tdd;

/**
 * Entry Point to Application.
 *
 * @author Taylan Kurt
 */
public class RomanNumbersApplication {


    public String convertToRomanFrom(int number) {
        if(number > 1)
            return  "II";
        else
            return "I";
    }
}
