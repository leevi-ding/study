package pattern.factory.chicken;

public class ShanghaiHotChicken extends Chicken{

    @Override
    protected void method1() {
        System.out.println("create Shanghai Hot Chicken");
    }

    @Override
    protected void method2() {
        System.out.println("boxed Shanghai Hot Chicken");
    }
}
