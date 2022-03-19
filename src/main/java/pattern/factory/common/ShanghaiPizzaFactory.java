package pattern.factory.common;

import pattern.factory.pizza.*;

public class ShanghaiPizzaFactory extends CommonPizzaFactory {

    @Override
    public Pizza createPizza(String taste) {
        if ("hot".equals(taste)) {
            return new ShanghaiHotPizza();
        } else {
            return new ShanghaiSweetPizza();
        }
    }
}
