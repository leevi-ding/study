package pattern.decorator.predesign.ingredient;

import pattern.decorator.predesign.Ingredient;

public class Chocolate implements Ingredient {

    private double price = 0.15;

    @Override
    public void cost() {
        System.out.println("chocolate cost " + price);
    }

    @Override
    public void describe() {
        System.out.println("add some chocolate");
    }
}
