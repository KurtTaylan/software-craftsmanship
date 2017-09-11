package com.craftsmanship.behavioralPatterns.example;

interface Visitor {

    void visit(com.craftsmanship.behavioralPatterns.example.FOO foo);

    void visit(com.craftsmanship.behavioralPatterns.example.BAR bar);

    void visit(BAZ baz);
}
