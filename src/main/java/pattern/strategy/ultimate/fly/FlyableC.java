package pattern.strategy.ultimate.fly;

import pattern.strategy.ultimate.Flyable;

public class FlyableC implements Flyable {
    @Override
    public void fly(){
        System.out.println("C fly .....");
    }
}
