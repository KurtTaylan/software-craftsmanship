package com.craftsmanship.behavioralPatterns.example1;

import java.util.Map;

interface Operand {
    double evaluate(Map<String, Integer> context);
    void traverse(int level);
}
