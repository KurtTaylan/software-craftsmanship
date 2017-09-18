package com.taylan.craftsmanship.bowlinggame;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Frame> frames = new ArrayList<>(10);

    public void addFrame(Frame frame) {
        frames.add(frame);
    }

    public Score calculateScore() {
        Integer score = frames.stream().mapToInt(Frame::getPoints).sum();
        return new Score(score);
    }

    public Frame getFrame(int frameIndex) {
        return frames.get(frameIndex-1);
    }
}
