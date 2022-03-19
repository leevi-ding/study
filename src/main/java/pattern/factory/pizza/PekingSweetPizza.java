package pattern.factory.pizza;

public class PekingSweetPizza extends Pizza{

    @Override
    protected void method1() {
        System.out.println("create Peking Sweet Pizza");
    }

    @Override
    protected void method2() {
        System.out.println("boxed Peking Sweet Pizza");
    }
}
