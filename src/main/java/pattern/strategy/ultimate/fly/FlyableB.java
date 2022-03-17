package pattern.strategy.ultimate.fly;

import pattern.strategy.ultimate.Flyable;

public class FlyableB implements Flyable {
    @Override
    public void fly(){
        System.out.println("B fly .....");
    }
}
