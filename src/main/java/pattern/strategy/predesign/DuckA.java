package pattern.strategy.predesign;

public class DuckA extends Duck {

    @Override
    public void fly(){
        System.out.println("A fly....");
    }

    @Override
    public void quack(){
        System.out.println("A quack.....");
    }
}
