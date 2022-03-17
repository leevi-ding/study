package pattern.strategy.designed;

import pattern.strategy.designed.duck.DuckA;
import pattern.strategy.designed.duck.DuckB;
import pattern.strategy.designed.duck.DuckC;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Duck duckA = new DuckA();
        Duck duckB = new DuckB();
        Duck duckC = new DuckC();
        List<Duck> ducks = Arrays.asList(duckA, duckB, duckC);
        ducks.forEach(Duck::fly);
        ducks.forEach(Duck::quack);
    }
}
