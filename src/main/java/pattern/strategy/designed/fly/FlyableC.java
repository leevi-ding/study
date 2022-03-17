package pattern.strategy.designed.fly;

import pattern.strategy.designed.Flyable;

public class FlyableC implements Flyable {
    @Override
    public void fly(){
        System.out.println("C fly .....");
    }
}
