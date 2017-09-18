package com.taylan.craftsmanship.bowlinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrameTest {

    @Test
    @DisplayName("First fail test")
    void should_knock_down_3_pins() {
        Frame frame = new Frame();
        frame.doRolling(3);

        assertEquals(3, frame.getPoints());
    }

    @Test
    public void should_knock_down_5_pins() {
        Frame frame = new Frame();
        frame.doRolling(5);

        assertEquals(5, frame.getPoints());
    }

    @Test
    public void should_roll_twice() {
        Frame frame = new Frame();
        frame.doRolling(3);
        frame.doRolling(5);

        assertEquals(8, frame.getPoints());
    }
}