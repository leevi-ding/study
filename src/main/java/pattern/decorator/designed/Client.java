package pattern.decorator.designed;

import pattern.decorator.designed.beverage.BasicBeverage;
import pattern.decorator.designed.decorator.IngredientDecorator;
import pattern.decorator.designed.decorator.SizeDecorator;
import pattern.decorator.predesign.SizeEnum;

public class Client {
    public static void main(String[] args) {
        SizeDecorator cuvetteMilkCoffee = new SizeDecorator(
                new IngredientDecorator(
                        new BasicBeverage(0.75, "this is a cup of coffee"), 0.22, "add some milk"
                ), SizeEnum.cuvette, "cuvette size"
        );
        SizeDecorator mediumSolidJuice = new SizeDecorator(
                new IngredientDecorator(
                        new BasicBeverage(0.45, "this is a cup of juice"), 0.12, "add some solid"
                ), SizeEnum.medium, "medium size"
        );
        System.out.println(cuvetteMilkCoffee.getDescribe());
        System.out.println("price is " + cuvetteMilkCoffee.cost());
        System.out.println(mediumSolidJuice.getDescribe());
        System.out.println("price is " + mediumSolidJuice.cost());
    }
}
