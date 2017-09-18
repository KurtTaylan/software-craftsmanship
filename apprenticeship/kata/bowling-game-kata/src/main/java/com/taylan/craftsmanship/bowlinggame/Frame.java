package com.taylan.craftsmanship.bowlinggame;

import java.util.ArrayList;
import java.util.List;

public class Frame {

    private List<Roll> rolls = new ArrayList<>();

    public void doRolling(int numberOfKnockedDownPins) {
        if (rolls.size() >= 2) throw new NotAllowedToRollException();
        rolls.add(new Roll(numberOfKnockedDownPins));
    }

    public int getPoints() {
        return rolls.stream().mapToInt(Roll::getPoints).sum();
    }

    public Roll getRoll(int index) {
        return rolls.get(index - 1);
    }
}
