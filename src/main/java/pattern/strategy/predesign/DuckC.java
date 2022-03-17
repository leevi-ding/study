package pattern.strategy.predesign;

public class DuckC extends Duck {

    @Override
    public void fly(){
        System.out.println("C fly....");
    }

    @Override
    public void quack(){
        System.out.println("C quack.....");
    }
}
