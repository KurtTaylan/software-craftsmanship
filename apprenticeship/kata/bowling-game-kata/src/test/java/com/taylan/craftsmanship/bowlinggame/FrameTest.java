package com.taylan.craftsmanship.bowlinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void should_roll_third_time_on_same_frame() {
        Frame frame = new Frame();
        frame.doRolling(3);
        frame.doRolling(5);

        assertThrows(NotAllowedToRollException.class, () ->
                frame.doRolling(2)
        );
    }

    @Test
    public void should_return_first_roll_of_frame() {
        Frame frame = new Frame();
        frame.doRolling(2);
        frame.doRolling(4);

        assertEquals(2, frame.getRoll(1).getPoints());
    }

    @Test
    public void should_return_spare_sign_when_frame_is_spare() {
        Frame frame = new Frame();
        frame.doRolling(2);
        frame.doRolling(8);

        assertAll("displayNames", () -> {
            assertEquals("2", frame.getRoll(1).getDisplayName());
            assertEquals("/", frame.getRoll(2).getDisplayName());
        });
    }

    @Test
    void should_return_strike_sign_when_frame_is_strike() {
        Frame frame = new Frame();
        frame.doRolling(10);

        assertEquals("X", frame.getRoll(1).getDisplayName());
    }
}