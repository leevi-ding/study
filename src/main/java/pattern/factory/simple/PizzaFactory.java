package pattern.factory.simple;

import pattern.factory.pizza.PekingPizza;
import pattern.factory.pizza.Pizza;
import pattern.factory.pizza.ShanghaiPizza;

public class PizzaFactory {
    public static Pizza createPizza(String city){
        if("peking".equals(city)){
            return new PekingPizza();
        }else{
            return new ShanghaiPizza();
        }
    }
}
