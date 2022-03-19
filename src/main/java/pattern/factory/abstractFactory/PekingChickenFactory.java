package pattern.factory.abstractFactory;


import pattern.factory.chicken.Chicken;
import pattern.factory.chicken.PekingHotChicken;
import pattern.factory.chicken.PekingSweetChicken;

public class PekingChickenFactory extends CommonChickenFactory {

    @Override
    public Chicken createChicken(String taste) {
        if ("hot".equals(taste)) {
            return new PekingHotChicken();
        } else {
            return new PekingSweetChicken();
        }
    }
}
