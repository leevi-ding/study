package pattern.factory.chicken;

public class ShanghaiSweetChicken extends Chicken{

    @Override
    protected void method1() {
        System.out.println("create Shanghai Sweet Chicken");
    }

    @Override
    protected void method2() {
        System.out.println("boxed Shanghai Sweet Chicken");
    }
}
