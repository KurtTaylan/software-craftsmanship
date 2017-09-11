package com.craftsmanship.behavioralPatterns.example2;

class Leaf implements Component {
    private int number;

    public Leaf(int value) {
        this.number = value;
    }

    public void traverse() {
        System.out.print(number + " ");
    }
}
