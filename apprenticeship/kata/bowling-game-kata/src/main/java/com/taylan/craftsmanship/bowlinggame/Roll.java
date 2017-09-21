package com.taylan.craftsmanship.bowlinggame;

public class Roll {

    private int points;
    private int previousPins;

    public Roll(int points, int previousPins) {
        this.points = points;
        this.previousPins = previousPins;
    }

    public int getPoints() {
        return points;
    }

    public String getDisplayName() {
        if (previousPins == 10 && points == 10) {
            return "X";
        }
        if (previousPins == points) {
            return "/";
        }
        return String.valueOf(points);
    }

}
