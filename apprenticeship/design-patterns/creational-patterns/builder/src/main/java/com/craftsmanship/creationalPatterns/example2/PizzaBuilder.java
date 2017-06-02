package com.craftsmanship.creationalPatterns.example2;

public abstract class PizzaBuilder {

    protected Pizza pizza;


    public void createNewPizzaProduct() {
        this.pizza = new Pizza();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();

    public Pizza getPizza() {
        return this.pizza;
    }
}
