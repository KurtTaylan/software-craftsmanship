package com.taylan.craftsmanship.bowlinggame;

public class Frame {

    private int points;
    private int numberOfRolls = 0;

    public void doRolling(int numberOfKnockedDownPins) {
        numberOfRolls++;
        if (numberOfRolls > 2) throw new NotAllowedToRollException();
        points += numberOfKnockedDownPins;
    }

    public int calculatePoints() {
        return points;
    }
}
