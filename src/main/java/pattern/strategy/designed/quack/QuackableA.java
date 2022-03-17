package pattern.strategy.designed.quack;

import pattern.strategy.designed.Quackable;

public class QuackableA implements Quackable {
    @Override
    public void quack(){
        System.out.println("A quack ....");
    }
}
