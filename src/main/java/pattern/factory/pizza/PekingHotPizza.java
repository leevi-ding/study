package pattern.factory.pizza;

public class PekingHotPizza extends Pizza{

    @Override
    protected void method1() {
        System.out.println("create Peking Hot Pizza");
    }

    @Override
    protected void method2() {
        System.out.println("boxed Peking Hot Pizza");
    }
}
