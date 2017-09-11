package com.craftsmanship.behavioralPatterns.example3;

// 1. The "wrapper" class
class Button {
    // 2. The "current" state object
    private State current;

    public Button() {
        current = OFF.instance();
    }

    public void setCurrent(State s) {
        current = s;
    }

    // 3. The "wrapper" always delegates to the "wrappee"
    public void push() {
        current.push(this);
    }
}
