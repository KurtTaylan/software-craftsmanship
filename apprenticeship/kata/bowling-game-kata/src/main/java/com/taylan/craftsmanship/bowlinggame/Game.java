package com.taylan.craftsmanship.bowlinggame;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Frame> frames = new ArrayList<>(10);

    public void addFrame(Frame frame) {
        frames.add(frame);
    }

    public Score calculateFrameScore(int frameNumber) {
        Frame frame = frames.get(frameNumber - 1);
        int framePoints = frame.getPoints();
        if (frames.size() > frameNumber) {
            if (frame.isSpare()) {
                framePoints += frames.get(frameNumber).getRoll(1).getPoints();
            } else if (frame.isStrike()) {
                framePoints += frames.get(frameNumber).getRoll(1).getPoints();
                framePoints += frames.get(frameNumber).getRoll(2).getPoints();
            }
        }
        return new Score(framePoints);
    }

    public Frame getFrame(int frameIndex) {
        return frames.get(frameIndex - 1);
    }
}
