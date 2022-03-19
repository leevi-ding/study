package pattern.factory.common;


import pattern.factory.pizza.PekingHotPizza;
import pattern.factory.pizza.PekingSweetPizza;
import pattern.factory.pizza.Pizza;

public class PekingPizzaFactory extends CommonPizzaFactory {

    @Override
    public Pizza createPizza(String taste) {
        if ("hot".equals(taste)) {
            return new PekingHotPizza();
        } else {
            return new PekingSweetPizza();
        }
    }
}
