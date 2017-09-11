package com.craftsmanship.behavioralPatterns.example1.after;

class Low implements State {
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new Medium());
        System.out.println("medium speed");
    }
}
