package com.taylan.craftsmanship.bowlinggame;


import java.util.ArrayList;
import java.util.List;

public class Frame {

    private List<Roll> rolls = new ArrayList<>();

    public void doRolling(int numberOfKnockedDownPins) {
        if (rolls.size() >= 2) throw new NotAllowedToRollException();
        String displayName = createDisplayName(numberOfKnockedDownPins);
        rolls.add(new Roll(numberOfKnockedDownPins, displayName));
    }

    private String createDisplayName(int numberOfKnockedDownPins) {
        String displayName;
        if (getPoints() + numberOfKnockedDownPins == 10) {
            if (rolls.isEmpty()) {
                displayName = "X";
            } else {
                displayName = "/";
            }
        } else {
            displayName = String.valueOf(numberOfKnockedDownPins);
        }
        return displayName;
    }

    public int getPoints() {
        return rolls.stream().mapToInt(Roll::getPoints).sum();
    }

    public Roll getRoll(int index) {
        return rolls.get(index - 1);
    }
}
