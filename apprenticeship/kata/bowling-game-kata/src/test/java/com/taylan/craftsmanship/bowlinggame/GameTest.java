package com.taylan.craftsmanship.bowlinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void should_roll_once() {
        Game game = new Game();
        Frame frame = new Frame();
        frame.doRolling(3);
        game.addFrame(frame);

        assertEquals(3, game.calculateScore());
    }

    @Test
    public void should_roll_twice() {
        Game game = new Game();
        Frame frame = new Frame();
        frame.doRolling(3);
        frame.doRolling(5);
        game.addFrame(frame);

        assertEquals(8, game.calculateScore());
    }

    @Test
    @DisplayName("Game ends successfully with multiple frames")
    void should_roll_game_with_multiple_frames() {
        Game game = new Game();
        Frame frame1 = new Frame();
        Frame frame2 = new Frame();
        frame2.doRolling(3);
        frame2.doRolling(6);
        frame1.doRolling(3);
        frame1.doRolling(6);

        game.addFrame(frame1);
        game.addFrame(frame2);

        assertEquals(18, game.calculateScore());
    }
}
