package com.craftsmanship.behavioralPatterns.example4;

// The "element" hierarchy
interface Element {
    void accept(ReflectiveVisitor v);
}
