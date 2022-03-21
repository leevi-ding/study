package pattern.template.designed;

public class Coffee extends BeverageTemplate{
    @Override
    protected void prepareSomething() {
        breCoffeeGrinds();
    }

    @Override
    protected void addSomething() {
        addSugarAndMilk();
    }

    private void breCoffeeGrinds() {
        System.out.println("bre coffee grinds");
    }

    private void addSugarAndMilk() {
        System.out.println("add sugar and milk");
    }
}
