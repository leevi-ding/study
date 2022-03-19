package pattern.factory.pizza;

public class ShanghaiSweetPizza extends Pizza{

    @Override
    protected void method1() {
        System.out.println("create Shanghai Sweet Pizza");
    }

    @Override
    protected void method2() {
        System.out.println("boxed Shanghai Sweet Pizza");
    }
}
