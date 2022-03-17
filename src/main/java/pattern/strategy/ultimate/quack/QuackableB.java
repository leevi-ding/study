package pattern.strategy.ultimate.quack;

import pattern.strategy.ultimate.Quackable;

public class QuackableB implements Quackable {
    @Override
    public void quack(){
        System.out.println("B quack ....");
    }
}
