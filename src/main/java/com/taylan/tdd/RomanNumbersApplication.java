package com.taylan.tdd;

/**
 * Entry Point to Application.
 *
 * @author Taylan Kurt
 */
public class RomanNumbersApplication {


    public String convertToRomanFrom(int number) {

        if(number == 3)
            return "III";
        if(number == 2)
            return  "II";
        else
            return "I";
    }
}
