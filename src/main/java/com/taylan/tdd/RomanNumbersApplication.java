package com.taylan.tdd;

/**
 * Entry Point to Application.
 *
 * @author Taylan Kurt
 */
public class RomanNumbersApplication {


    public String runConverter(int inputValue) {
        String output = "";
        String numberInString = "" + inputValue;

        for (int positionCounter = 1; positionCounter < numberInString.length() + 1; positionCounter++) {
            int digit = Character.getNumericValue(numberInString.charAt(positionCounter - 1));
            int value = numberInString.length() - ( positionCounter - 1 );

            for (int i = 1; i < value; i ++)
                digit *= 10;

            String tempVa = convertToRomanFrom(digit);
            output += tempVa;
        }

        return output;
    }


    public String convertToRomanFrom(int inputNumber) {

        if (inputNumber == 0) // Nothing to do about it
            return "";

        if (inputNumber > 3000) // No roman number can occur more than three times in row.
            throw new IllegalArgumentException("This number is beyond than application scope ! Kırdın Beni gat damit 😤");


        for (RomanConstants romanConstant : RomanConstants.values()) {

            int value = romanConstant.value;
            int backValue = romanConstant.backValue;
            int backDifference = value - backValue;

            int currentLevelDifference = inputNumber - value;

            if (backDifference == inputNumber)
                return getRomanNumber(backDifference); // Prefix;

            if (currentLevelDifference >= 0) { // Suffix

                return romanConstant.name() + convertToRomanFrom(currentLevelDifference);
            }
        }

        throw new IllegalArgumentException("What did you do ?!! 🤕");
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
        }

        return "";
    }


    private enum RomanConstants {

        M(1000, 100),
        D(500, 100),
        C(100, 10),
        L(50, 10),
        X(10, 1),
        V(5, 1),
        I(1, 1),
        Error(0, 0);

        private final int value;
        private final int backValue;

        RomanConstants(int value, int backValue) {
            this.value = value;
            this.backValue = backValue;
        }


        RomanConstants safeValueOf(final String candidate) {
            try {

                return RomanConstants.valueOf(candidate);

            } catch (final IllegalArgumentException e) {
                return Error;
            }
        }
    }

}
