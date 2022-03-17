package pattern.strategy.ultimate;

public class DuckImpl implements Duck{

    private Flyable flyable;
    private Quackable quackable;

    public DuckImpl(Flyable flyable,Quackable quackable){
        this.flyable = flyable;
        this.quackable = quackable;
    }

    @Override
    public void fly(){
        flyable.fly();
    }

    @Override
    public void quack(){
        quackable.quack();
    }
}
