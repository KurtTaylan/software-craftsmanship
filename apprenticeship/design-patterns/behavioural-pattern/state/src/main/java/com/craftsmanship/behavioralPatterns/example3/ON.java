package com.craftsmanship.behavioralPatterns.example3;

class ON extends State {
    private static ON instance = new ON();

    private ON() {}

    public static State instance() {
        return instance;
    }
}
