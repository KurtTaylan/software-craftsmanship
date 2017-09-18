package com.taylan.craftsmanship.bowlinggame;

public class Game {

    private Frame frame;

    public void addFrame(Frame frame) {
        this.frame = frame;
    }

    public int getScore() {
        return frame.getPoints();
    }
}
