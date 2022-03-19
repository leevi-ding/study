package pattern.decorator.predesign.ingredient;

import pattern.decorator.predesign.Ingredient;

public class Ormosia implements Ingredient {

    private double price = 0.28;

    @Override
    public double cost() {
        return price;
    }

    @Override
    public void describe() {
        System.out.println("add some ormosia");
    }
}
