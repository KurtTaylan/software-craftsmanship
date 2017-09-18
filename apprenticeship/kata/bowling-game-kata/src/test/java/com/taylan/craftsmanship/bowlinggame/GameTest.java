package com.taylan.craftsmanship.bowlinggame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void should_roll_number_one() {
        Game game = new Game();
        Frame frame = new Frame();
        frame.doRolling(3);
        game.addFrame(frame);

        assertEquals(3, game.getScore());
    }
}
