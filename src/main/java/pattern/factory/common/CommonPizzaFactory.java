package pattern.factory.common;

import pattern.factory.pizza.Pizza;

public abstract class CommonPizzaFactory {

    public static Pizza createPizza(String city, String taste) {
        if("peking".equals(city)){
            return new PekingPizzaFactory().createPizza(taste);
        }else{
            return new ShanghaiPizzaFactory().createPizza(taste);
        }
    }

    abstract Pizza createPizza(String taste);
}
