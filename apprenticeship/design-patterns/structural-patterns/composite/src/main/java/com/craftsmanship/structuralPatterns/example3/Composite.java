package com.craftsmanship.structuralPatterns.example3;

// 2. "is a " relationship
public abstract class Composite implements Component{

    // 3. couple to interface
    private Component[] children = new Component[9];
    private int total = 0;
    private int value;

    public Composite(int value) {
        this.value = value;
    }

    // 3. couple to interface
    public void add(Component component){
        children[total ++] = component;
    }

    @Override
    public void traverse() {
        System.out.println( value + " ");
        for (int i = 0; i < total; i++){
            // 4. Delegation and polymorphism
            children[i].traverse();
        }
    }
}
