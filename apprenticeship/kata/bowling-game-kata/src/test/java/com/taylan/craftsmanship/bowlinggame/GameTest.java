package com.taylan.craftsmanship.bowlinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void should_roll_once() {
        Game game = new Game();
        Frame frame = new Frame();
        frame.doRolling(3, 10);
        game.addFrame(frame);

        assertEquals(new Score(3), game.calculateFrameScore(1));
    }

    @Test
    public void should_roll_twice() {
        Game game = new Game();
        Frame frame = new Frame();
        frame.doRolling(3, 10);
        frame.doRolling(5, 7);
        game.addFrame(frame);

        assertEquals(new Score(8), game.calculateFrameScore(1));
    }

    @Test
    @DisplayName("Game ends successfully with multiple frames")
    void should_roll_game_with_multiple_frames() {
        Game game = new Game();
        Frame frame1 = new Frame();
        Frame frame2 = new Frame();
        frame2.doRolling(3, 10);
        frame2.doRolling(6, 7);
        frame1.doRolling(3, 10);
        frame1.doRolling(6, 7);

        game.addFrame(frame1);
        game.addFrame(frame2);

        assertEquals(new Score(9), game.calculateFrameScore(1));
        assertEquals(new Score(9), game.calculateFrameScore(2));
    }

    @Test
    public void should_calculate_spare_score_for_single_frame() {
        Game game = new Game();
        Frame frame1 = new Frame();
        frame1.doRolling(3, 10);
        frame1.doRolling(7, 7);
        game.addFrame(frame1);

        assertEquals("", game.calculateFrameScore(1).getValue());
    }

    @Test
    public void should_show_first_frame_score() {
        Game game = new Game();
        Frame frame1 = new Frame();
        Frame frame2 = new Frame();
        frame1.doRolling(3, 10);
        frame1.doRolling(5, 7);
        frame2.doRolling(2, 10);
        frame2.doRolling(4, 8);

        game.addFrame(frame1);
        game.addFrame(frame2);

        assertEquals(8, game.getFrame(1).getPoints());
    }

    @Test
    void should_calculate_points_for_spare() {
        Game game = new Game();

        Frame frame1 = new Frame();
        frame1.doRolling(2, 10);
        frame1.doRolling(8, 8);
        game.addFrame(frame1);

        assertEquals("", game.calculateFrameScore(1).getValue());

        Frame frame2 = new Frame();
        frame2.doRolling(4, 10);
        frame2.doRolling(2, 6);
        game.addFrame(frame2);

        assertEquals("14", game.calculateFrameScore(1).getValue());
        assertEquals("6", game.calculateFrameScore(2).getValue());
    }
}
