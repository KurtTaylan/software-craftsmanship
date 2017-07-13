package com.craftsmanship.creationalPatterns.example2;

import java.util.ArrayList;
import java.util.List;

public class Box extends BaseEntity {

    private List children = new ArrayList();
    private int value;

    public Box(int val) {
        value = val;
    }

    public void add(BaseEntity c) {
        children.add(c);
    }

    public void traverse(int[] levels) {
        if (printThisLevel(levels)) {
            System.out.println(indent.toString() + value);
            indent.append("   ");
        }
        level++;
        for (int i = 0; i < children.size(); i++)
            ((BaseEntity) children.get(i)).traverse(levels);
        level--;
        if (printThisLevel(levels))
            indent.setLength(indent.length() - 3);
    }
}
