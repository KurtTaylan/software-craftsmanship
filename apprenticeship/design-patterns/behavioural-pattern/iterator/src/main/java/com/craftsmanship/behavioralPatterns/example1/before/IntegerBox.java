package com.craftsmanship.behavioralPatterns.example1.before;

import java.util.ArrayList;
import java.util.List;

class IntegerBox {
    private final List<Integer> list = new ArrayList<>();

    public void add(int in) {
        list.add(in);
    }

    public List getData() {
        return list;
    }
}
