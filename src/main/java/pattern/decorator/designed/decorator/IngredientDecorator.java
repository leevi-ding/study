package pattern.decorator.designed.decorator;

import lombok.NonNull;
import pattern.decorator.designed.Beverage;

public class IngredientDecorator implements BeverageDecorator {

    private double price;
    private String describe;
    @NonNull
    private Beverage beverage;

    public IngredientDecorator(Beverage beverage, double price , String describe) {
        this.beverage = beverage;
        this.price = price;
        this.describe = describe;
    }

    @Override
    public double cost() {
        return this.price + beverage.cost();
    }

    @Override
    public String getDescribe() {
        return beverage.getDescribe() + "\n" + this.describe;
    }
}
