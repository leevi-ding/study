package pattern.decorator.designed.decorator;

import lombok.NonNull;
import pattern.decorator.designed.Beverage;
import pattern.decorator.predesign.SizeEnum;

public class SizeDecorator implements BeverageDecorator {

    private SizeEnum size;
    private String describe;
    @NonNull
    private Beverage beverage;

    public SizeDecorator(Beverage beverage, SizeEnum size, String describe) {
        this.beverage = beverage;
        this.size = size;
        this.describe = describe;
    }

    @Override
    public double cost() {
        return beverage.cost() + size.getValue();
    }

    @Override
    public String getDescribe() {
        return beverage.getDescribe() + "\n" + this.describe;
    }

}
