package pattern.factory.chicken;

public class PekingSweetChicken extends Chicken{

    @Override
    protected void method1() {
        System.out.println("create Peking Sweet Chicken");
    }

    @Override
    protected void method2() {
        System.out.println("boxed Peking Sweet Chicken");
    }
}
