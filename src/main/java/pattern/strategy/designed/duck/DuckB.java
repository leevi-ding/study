package pattern.strategy.designed.duck;

import pattern.strategy.designed.Duck;
import pattern.strategy.designed.Flyable;
import pattern.strategy.designed.Quackable;
import pattern.strategy.designed.fly.FlyableB;
import pattern.strategy.designed.quack.QuackableB;

public class DuckB implements Duck {

    private Flyable flyable;
    private Quackable quackable;

    public DuckB(){
        this.flyable = new FlyableB();
        this.quackable = new QuackableB();
    }

    @Override
    public void fly(){
        flyable.fly();
    }

    @Override
    public void quack(){
        quackable.quack();
    }
}
