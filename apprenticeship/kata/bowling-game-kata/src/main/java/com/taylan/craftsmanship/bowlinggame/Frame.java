package com.taylan.craftsmanship.bowlinggame;

public class Frame {

    private int points;

    public void doRolling(int numberOfKnockedDownPins) {
        points += numberOfKnockedDownPins;
    }

    public int getPoints() {
        return points;
    }
}
