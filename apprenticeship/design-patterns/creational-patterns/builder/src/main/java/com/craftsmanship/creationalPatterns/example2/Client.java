package com.craftsmanship.creationalPatterns.example2;

public class Client {


    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiianPizzaBuilder );
        waiter.constructPizza();

        Pizza hawaiianPizza = waiter.getPizza();
        System.out.println(hawaiianPizza.toString());

        waiter.setPizzaBuilder( spicyPizzaBuilder );
        waiter.constructPizza();

        Pizza spicyPizza = waiter.getPizza();
        System.out.println(spicyPizza.toString());
    }
}
