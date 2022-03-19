package pattern.decorator.designed.beverage;

import pattern.decorator.designed.Beverage;

public class BasicBeverage implements Beverage {

    private double price;
    private String describe;

    public BasicBeverage(double price, String describe){
        this.price = price;
        this.describe = describe;
    }

    @Override
    public double cost() {
        return price;
    }

    @Override
    public String getDescribe() {
        return describe;
    }
}
