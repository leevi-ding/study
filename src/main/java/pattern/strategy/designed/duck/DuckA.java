package pattern.strategy.designed.duck;

import pattern.strategy.designed.Duck;
import pattern.strategy.designed.Flyable;
import pattern.strategy.designed.Quackable;
import pattern.strategy.designed.fly.FlyableA;
import pattern.strategy.designed.quack.QuackableA;

public class DuckA implements Duck {

    private Flyable flyable;
    private Quackable quackable;

    public DuckA(){
        this.flyable = new FlyableA();
        this.quackable = new QuackableA();
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
