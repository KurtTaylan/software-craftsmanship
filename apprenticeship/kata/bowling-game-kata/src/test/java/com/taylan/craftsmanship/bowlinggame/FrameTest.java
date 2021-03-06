package com.taylan.craftsmanship.bowlinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrameTest {

    @Test
    @DisplayName("First fail test")
    void should_knock_down_3_pins() {
        Frame frame = new Frame();
        frame.doRolling(3, 10);

        assertEquals(3, frame.getPoints());
    }

    @Test
    public void should_knock_down_5_pins() {
        Frame frame = new Frame();
        frame.doRolling(5, 10);

        assertEquals(5, frame.getPoints());
    }

    @Test
    public void should_roll_twice() {
        Frame frame = new Frame();
        frame.doRolling(3, 10);
        frame.doRolling(5, 7);

        assertEquals(8, frame.getPoints());
    }

    @Test
    public void should_not_roll_third_time_on_same_frame() {
        Frame frame = new Frame();
        frame.doRolling(3, 10);
        frame.doRolling(5, 7);

        assertThrows(NotAllowedToRollException.class, () ->
                frame.doRolling(2, 10)
        );
    }

    @Test
    public void should_return_first_roll_of_frame() {
        Frame frame = new Frame();
        frame.doRolling(2, 10);
        frame.doRolling(4, 8);

        assertEquals(2, frame.getRoll(1).getPoints());
    }

}