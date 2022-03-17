package pattern.strategy.ultimate.fly;

import pattern.strategy.ultimate.Flyable;

public class FlyableA implements Flyable {
    @Override
    public void fly(){
        System.out.println("A fly .....");
    }
}
