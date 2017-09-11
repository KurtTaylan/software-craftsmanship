package com.craftsmanship.behavioralPatterns.example4;

class That implements Element {
    public void accept(ReflectiveVisitor v) {
        v.visit(this);
    }

    public String that() {
        return "That";
    }
}
