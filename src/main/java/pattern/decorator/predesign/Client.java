package pattern.decorator.predesign;

import pattern.decorator.predesign.beverage.Milk;
import pattern.decorator.predesign.ingredient.Chocolate;

public class Client {
    public static void main(String[] args) {
        Beverage beverage = new Milk();
        beverage.describe();
        beverage.cost();
        Chocolate chocolate = new Chocolate();
        chocolate.describe();
        chocolate.cost();
    }
}
