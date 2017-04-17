package com.taylan.tdd.service;

import com.taylan.tdd.dto.RomanConstants;

/**
 * Business Logic: Converting from Arabic Numbers to Roman Numbers.
 */
public class Converter {



    public String convertToRomanFrom(int inputNumber) {

        if (inputNumber == 0) // Nothing to do about it
            return "";

        if (inputNumber > 3000) // No roman number can occur more than three times in row.
            throw new IllegalArgumentException("This number is beyond than application scope ! Kırdın Beni gat damit 😤");


        for (RomanConstants romanConstant : RomanConstants.values()) {

            int value = romanConstant.getValue();
            int backValue = romanConstant.getBackValue();
            int backDifference = value - backValue;

            int currentLevelDifference = inputNumber - value;

            if (backDifference == inputNumber)
                return getRomanNumber(backDifference); // Prefix;

            if (currentLevelDifference >= 0) { // Suffix
                return romanConstant.name() + convertToRomanFrom(currentLevelDifference);
            }
        }

        throw new IllegalArgumentException("Invalid Number. What did you do ?!! 🤕");
    }


    public String getRomanNumber(int number) {

        switch (number) {
            case 1000:
                return RomanConstants.M.name();
            case 900:
                return getRomanNumber(100) + getRomanNumber(1000);
            case 500:
                return RomanConstants.D.name();
            case 400:
                return getRomanNumber(100) + getRomanNumber(500);
            case 100:
                return RomanConstants.C.name();
            case 90:
                return getRomanNumber(10) + getRomanNumber(100);
            case 50:
                return RomanConstants.L.name();
            case 40:
                return getRomanNumber(10) + getRomanNumber(50);
            case 10:
                return RomanConstants.X.name();
            case 9:
                return getRomanNumber(1) + getRomanNumber(10);
            case 5:
                return RomanConstants.V.name();
            case 4:
                return getRomanNumber(1) + getRomanNumber(5);
            case 1:
                return RomanConstants.I.name();
            default:
                throw new IllegalArgumentException("You tried to reach roman number not in our dictionary. Becareful son..");
        }
    }
}
