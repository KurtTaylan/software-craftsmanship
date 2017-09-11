package com.craftsmanship.behavioralPatterns.example1.after;

class High implements State {
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new Off());
        System.out.println("turning off");
    }
}
