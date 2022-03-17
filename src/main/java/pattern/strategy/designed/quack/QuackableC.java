package pattern.strategy.designed.quack;

import pattern.strategy.designed.Quackable;

public class QuackableC implements Quackable {
    @Override
    public void quack(){
        System.out.println("C quack ....");
    }
}
