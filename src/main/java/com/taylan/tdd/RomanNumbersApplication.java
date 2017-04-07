package com.taylan.tdd;

/**
 * Entry Point to Application.
 *
 * @author Taylan Kurt
 */
public class RomanNumbersApplication {


    public String convertToRomanFrom(int number) {


        if (number == 1)
            return  "I";
        else if (number == 2)
            return "II";
        else if (number == 3)
            return "III";
        else if (number > 3 && number < 5)
            return convertToRomanFrom(5-number) + "V"; // Left-side
        else if (number == 5)
            return "V";
        else if (number > 5 && number < 10)
            return "V"+ convertToRomanFrom(number - 5); // Right-side
        else if (number == 10)
            return "X";
        else
            return "I";

    }
}
