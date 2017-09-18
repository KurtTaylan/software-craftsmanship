package com.taylan.craftsmanship.bowlinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrameTest {

    @Test
    @DisplayName("First fail test")
    void should_roll_once() {
        Frame frame = new Frame();
        frame.doRolling(3);

        assertEquals(3, frame.getPoints());
    }

    @Test
    public void should_roll_twice() {
        Frame frame = new Frame();
        frame.doRolling(5);

        assertEquals(5, frame.getPoints());

    }
}