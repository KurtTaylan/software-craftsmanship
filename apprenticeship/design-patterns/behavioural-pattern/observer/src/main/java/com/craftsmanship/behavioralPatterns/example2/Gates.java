package com.craftsmanship.behavioralPatterns.example2;

class Gates implements AlarmListener {
    public void alarm() {
        System.out.println("gates close");
    }
}
