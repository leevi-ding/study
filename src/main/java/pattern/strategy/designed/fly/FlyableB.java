package pattern.strategy.designed.fly;

import pattern.strategy.designed.Flyable;

public class FlyableB implements Flyable {
    @Override
    public void fly(){
        System.out.println("B fly .....");
    }
}
