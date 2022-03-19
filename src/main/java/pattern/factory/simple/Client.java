package pattern.factory.simple;

import pattern.factory.pizza.Pizza;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = PizzaFactory.createPizza("peking");
        pizza.cook();
    }
}
