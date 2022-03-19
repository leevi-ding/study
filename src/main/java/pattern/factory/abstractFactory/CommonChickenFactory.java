package pattern.factory.abstractFactory;

import pattern.factory.chicken.Chicken;
import pattern.factory.common.PekingPizzaFactory;
import pattern.factory.common.ShanghaiPizzaFactory;
import pattern.factory.pizza.Pizza;

public abstract class CommonChickenFactory {

    public static Chicken createChicken(String city, String taste) {
        if("peking".equals(city)){
            return new PekingChickenFactory().createChicken(taste);
        }else{
            return new ShanghaiChickenFactory().createChicken(taste);
        }
    }

    abstract Chicken createChicken(String taste);
}
