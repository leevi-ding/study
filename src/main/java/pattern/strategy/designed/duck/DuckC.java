package pattern.strategy.designed.duck;

import pattern.strategy.designed.Duck;
import pattern.strategy.designed.Flyable;
import pattern.strategy.designed.Quackable;
import pattern.strategy.designed.fly.FlyableC;
import pattern.strategy.designed.quack.QuackableC;

public class DuckC implements Duck {

    private Flyable flyable;
    private Quackable quackable;

    public DuckC(){
        this.flyable = new FlyableC();
        this.quackable = new QuackableC();
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
