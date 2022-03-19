package pattern.factory.pizza;

public class PekingPizza extends Pizza{

    @Override
    protected void method1() {
        System.out.println("create Peking Pizza");
    }

    @Override
    protected void method2() {
        System.out.println("boxed1...");
    }
}
