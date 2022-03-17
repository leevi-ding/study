package pattern.strategy.ultimate;

import pattern.strategy.ultimate.fly.FlyableA;
import pattern.strategy.ultimate.fly.FlyableB;
import pattern.strategy.ultimate.fly.FlyableC;
import pattern.strategy.ultimate.quack.QuackableA;
import pattern.strategy.ultimate.quack.QuackableB;
import pattern.strategy.ultimate.quack.QuackableC;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Duck> ducks = Arrays.asList(
            DuckFactory.createDuck(new FlyableA(),new QuackableA()),
            DuckFactory.createDuck(new FlyableB(),new QuackableB()),
            DuckFactory.createDuck(new FlyableC(),new QuackableC())
        );
        ducks.forEach(Duck::fly);
        ducks.forEach(Duck::quack);
    }
}
