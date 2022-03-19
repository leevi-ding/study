package pattern.factory.chicken;

public class PekingHotChicken extends Chicken{

    @Override
    protected void method1() {
        System.out.println("create Peking Hot Chicken");
    }

    @Override
    protected void method2() {
        System.out.println("boxed Peking Hot Chicken");
    }
}
