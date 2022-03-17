package pattern.strategy.ultimate;

public class DuckFactory {
    public static Duck createDuck(Flyable flyable, Quackable quackable){
        return new DuckImpl(flyable,quackable);
    }
}
