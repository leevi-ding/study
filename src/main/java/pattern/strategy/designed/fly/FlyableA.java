package pattern.strategy.designed.fly;

import pattern.strategy.designed.Flyable;

public class FlyableA implements Flyable {
    @Override
    public void fly(){
        System.out.println("A fly .....");
    }
}
