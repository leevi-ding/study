package pattern.strategy.predesign;

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
