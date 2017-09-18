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

        assertEquals(new Score(3), game.calculateScore());
    }

    @Test
    public void should_roll_twice() {
        Game game = new Game();
        Frame frame = new Frame();
        frame.doRolling(3);
        frame.doRolling(5);
        game.addFrame(frame);

        assertEquals(new Score(8), game.calculateScore());
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

        assertEquals(new Score(18), game.calculateScore());
    }

    @Test
    public void should_calculate_spare_score_for_single_frame() {
        Game game = new Game();
        Frame frame1 = new Frame();
        frame1.doRolling(3);
        frame1.doRolling(7);

        game.addFrame(frame1);

        assertEquals("", game.calculateScore().getValue());
    }

    @Test
    public void should_show_first_frame_score() {
        Game game = new Game();
        Frame frame1 = new Frame();
        Frame frame2 = new Frame();
        frame1.doRolling(3);
        frame1.doRolling(5);
        frame2.doRolling(2);
        frame2.doRolling(4);

        game.addFrame(frame1);
        game.addFrame(frame2);

        assertEquals(8, game.getFrame(1).getPoints());
    }
}
