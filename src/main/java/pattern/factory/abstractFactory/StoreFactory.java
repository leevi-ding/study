package pattern.factory.abstractFactory;

import pattern.factory.chicken.Chicken;
import pattern.factory.pizza.Pizza;

public interface StoreFactory {
    Pizza createPizza(String city, String taste);
    Chicken createChicken(String city, String taste);
}
