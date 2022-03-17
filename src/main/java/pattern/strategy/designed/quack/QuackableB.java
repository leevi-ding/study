package pattern.strategy.designed.quack;

import pattern.strategy.designed.Quackable;

public class QuackableB implements Quackable {
    @Override
    public void quack(){
        System.out.println("B quack ....");
    }
}
