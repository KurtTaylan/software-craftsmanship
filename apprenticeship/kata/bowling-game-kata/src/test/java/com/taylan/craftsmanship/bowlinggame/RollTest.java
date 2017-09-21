package com.taylan.craftsmanship.bowlinggame;

import com.taylan.craftsmanship.bowlinggame.base.BaseUT;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RollTest {

    @Test
    public void should_return_display() {
        assertEquals("2", new Roll(2, 10).getDisplayName());
    }

    @Test
    public void should_return_spare_sign() {
        assertEquals("/", new Roll(8, 8).getDisplayName());
    }

    @Test
    void should_return_strike_sign() {
        assertEquals("X", new Roll(10, 10).getDisplayName());
    }
}