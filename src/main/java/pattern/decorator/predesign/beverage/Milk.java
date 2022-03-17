package pattern.decorator.predesign.beverage;

import pattern.decorator.predesign.Beverage;

public class Milk implements Beverage {

    private double price = 1.33;

    @Override
    public void cost() {
        System.out.println("the price is "+ price);
    }

    @Override
    public void describe() {
        System.out.println("this is milk");
    }
}
