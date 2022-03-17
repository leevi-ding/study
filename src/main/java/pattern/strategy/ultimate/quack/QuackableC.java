package pattern.strategy.ultimate.quack;

import pattern.strategy.ultimate.Quackable;

public class QuackableC implements Quackable {
    @Override
    public void quack(){
        System.out.println("C quack ....");
    }
}
