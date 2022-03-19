package pattern.factory.abstractFactory;

import pattern.factory.chicken.Chicken;
import pattern.factory.common.CommonPizzaFactory;
import pattern.factory.pizza.Pizza;

public class CommonStoreFactory implements StoreFactory{
    public Pizza createPizza(String city, String taste){
        return CommonPizzaFactory.createPizza(city, taste);
    }

    public Chicken createChicken(String city, String taste){
        return CommonChickenFactory.createChicken(city, taste);
    }
}
