package com.craftsmanship.creationalPatterns.example2;

public class SpicyPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("hot");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }
}
