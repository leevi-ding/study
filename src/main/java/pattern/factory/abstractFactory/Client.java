package pattern.factory.abstractFactory;

import pattern.factory.chicken.Chicken;
import pattern.factory.pizza.Pizza;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Chicken pekingChicken = new CommonStoreFactory().createChicken("peking", "hot");
        Chicken shanghaiChicken = new CommonStoreFactory().createChicken("shanghai", "sweet");
        Pizza pekingPizza = new CommonStoreFactory().createPizza("peking", "hot");
        Pizza shanghaiPizza = new CommonStoreFactory().createPizza("shanghai", "sweet");
        Arrays.asList(pekingChicken,shanghaiChicken).forEach(Chicken::cook);
        Arrays.asList(pekingPizza,shanghaiPizza).forEach(Pizza::cook);
    }
}
