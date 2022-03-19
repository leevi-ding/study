package pattern.factory.common;

import pattern.factory.pizza.Pizza;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pizza pizza1 = CommonPizzaFactory.createPizza("shanghai", "hot");
        Pizza pizza2 = CommonPizzaFactory.createPizza("shanghai", "sweet");
        Pizza pizza3 = CommonPizzaFactory.createPizza("peking", "hot");
        Pizza pizza4 = CommonPizzaFactory.createPizza("peking", "sweet");
        List<Pizza> pizzas = Arrays.asList(pizza1, pizza2, pizza3, pizza4);
        pizzas.forEach(Pizza::cook);
    }
}
