package pattern.decorator.predesign;

import pattern.decorator.predesign.ingredient.Chocolate;
import pattern.decorator.predesign.ingredient.Ormosia;

public class Client {
    public static void main(String[] args) {
        Beverage coffee = new Beverage(1.28, "this is a cup of coffee!");
        coffee.addIngredient(new Chocolate());
        Beverage milk = new Beverage(0.98, "this is a cup of milk!");
        milk.addIngredient(new Ormosia());
        coffee.cost();
        coffee.describe();
        milk.cost();
        milk.describe();
    }
}
