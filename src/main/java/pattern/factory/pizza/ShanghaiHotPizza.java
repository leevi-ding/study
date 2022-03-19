package pattern.factory.pizza;

public class ShanghaiHotPizza extends Pizza{

    @Override
    protected void method1() {
        System.out.println("create Shanghai Hot Pizza");
    }

    @Override
    protected void method2() {
        System.out.println("boxed Shanghai Hot Pizza");
    }
}
