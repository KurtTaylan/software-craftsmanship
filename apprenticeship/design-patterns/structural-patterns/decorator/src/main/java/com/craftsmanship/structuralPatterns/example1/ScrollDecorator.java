package com.craftsmanship.structuralPatterns.example1;

// 6. Optional embellishment
class ScrollDecorator extends Decorator {
    public ScrollDecorator(Widget widget) {
        super(widget);
    }
    public void draw() {
        super.draw(); // 7. Delegate to base class and add extra stuff
        System.out.println("  ScrollDecorator");
    }
}
