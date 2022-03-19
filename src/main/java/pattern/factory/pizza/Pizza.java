package pattern.factory.pizza;

public abstract class Pizza {
    private double price;
    private String describe;

    private String city;
    
    public void cook(){
        method1();
        method2();
    }

    protected abstract void method2();

    protected abstract void method1();
}
