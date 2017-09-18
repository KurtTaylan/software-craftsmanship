package com.taylan.craftsmanship.bowlinggame;

public class Roll {

    private int points;
    private String displayName;

    public Roll(int points, String displayName) {
        this.points = points;
        this.displayName = displayName;
    }

    public int getPoints() {
        return points;
    }

    public String getDisplayName() {
        return displayName;
    }

}
