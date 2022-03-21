package pattern.template.designed;

public class Tea extends BeverageTemplate{
    @Override
    protected void prepareSomething() {
        steepTeaBag();
        addLemon();
    }

    @Override
    protected void addSomething() {
    }

    private void steepTeaBag() {
        System.out.println("steep tea bag");
    }

    private void addLemon() {
        System.out.println("add lemon");
    }
}
