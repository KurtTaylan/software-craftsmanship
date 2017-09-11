package com.craftsmanship.behavioralPatterns.example;

class BAR implements Element {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getBAR() {
        return "BAR";
    }
}
