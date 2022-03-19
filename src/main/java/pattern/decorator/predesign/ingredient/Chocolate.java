package pattern.decorator.predesign.ingredient;

import pattern.decorator.predesign.Ingredient;

public class Chocolate implements Ingredient {

    private double price = 0.15;

    @Override
    public double cost() {
        return price;
    }

    @Override
    public void describe() {
        System.out.println("add some chocolate");
    }
}
