package pattern.factory.abstractFactory;


import pattern.factory.chicken.*;

public class ShanghaiChickenFactory extends CommonChickenFactory {

    @Override
    public Chicken createChicken(String taste) {
        if ("hot".equals(taste)) {
            return new ShanghaiHotChicken();
        } else {
            return new ShanghaiSweetChicken();
        }
    }
}
