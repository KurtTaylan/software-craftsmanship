package com.taylan.craftsmanship.bowlinggame;


import java.util.ArrayList;
import java.util.List;

public class Frame {

    private List<Roll> rolls = new ArrayList<>();

    public void doRolling(int numberOfKnockedDownPins, int previousPins) {
        if (rolls.size() >= 2) throw new NotAllowedToRollException();
        rolls.add(new Roll(numberOfKnockedDownPins, previousPins));
    }

    public int getPoints() {
        return rolls.stream().mapToInt(Roll::getPoints).sum();
    }

    public Roll getRoll(int index) {
        return rolls.get(index - 1);
    }

    public boolean isSpare() {
        return rolls.size() == 2 && getPoints() == 10;
    }
}
