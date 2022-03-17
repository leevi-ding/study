package pattern.strategy.ultimate.quack;

import pattern.strategy.ultimate.Quackable;

public class QuackableA implements Quackable {
    @Override
    public void quack(){
        System.out.println("A quack ....");
    }
}
