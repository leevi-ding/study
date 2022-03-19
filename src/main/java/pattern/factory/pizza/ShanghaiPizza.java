package pattern.factory.pizza;

public class ShanghaiPizza extends Pizza{

    @Override
    protected void method1() {
        System.out.println("create Shanghai Pizza");
    }

    @Override
    protected void method2() {
        System.out.println("boxed2...");
    }
}
