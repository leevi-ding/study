package pattern.strategy.predesign;

public class DuckB extends Duck {

    @Override
    public void fly(){
        System.out.println("B fly....");
    }

    @Override
    public void quack(){
        System.out.println("B quack.....");
    }
}
