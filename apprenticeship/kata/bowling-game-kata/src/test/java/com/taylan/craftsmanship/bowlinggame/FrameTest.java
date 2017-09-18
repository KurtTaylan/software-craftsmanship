package com.taylan.craftsmanship.bowlinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrameTest {

    @Test
    @DisplayName("First fail test")
    void testNothing() {
        Frame frame = new Frame();
        frame.doRolling(3);

        assertEquals(3, frame.getPoints());
    }
}