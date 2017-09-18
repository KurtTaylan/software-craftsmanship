package com.taylan.craftsmanship.bowlinggame;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Frame> frames = new ArrayList<>(10);

    public void addFrame(Frame frame) {
        frames.add(frame);
    }

    public int calculateScore() {
        return frames.stream().mapToInt(Frame::calculatePoints).sum();
    }
}
