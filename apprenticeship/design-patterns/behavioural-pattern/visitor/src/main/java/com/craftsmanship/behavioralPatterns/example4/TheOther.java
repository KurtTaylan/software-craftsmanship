package com.craftsmanship.behavioralPatterns.example4;

class TheOther implements Element {
    public void accept(ReflectiveVisitor v) {
        v.visit(this);
    }

    public String theOther() {
        return "TheOther";
    }
}
