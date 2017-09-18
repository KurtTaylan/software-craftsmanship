package com.taylan.craftsmanship.bowlinggame;

public class Roll {

    private int points;

    public Roll(int numberOfKnockedDownPins) {
        this.points = numberOfKnockedDownPins;
    }

    public int getPoints() {
        return points;
    }
}
