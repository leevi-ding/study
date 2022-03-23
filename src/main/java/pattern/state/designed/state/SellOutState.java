package pattern.state.designed.state;

import pattern.state.designed.DesignedMachine;
import pattern.state.designed.State;

public class SellOutState extends State {

    private DesignedMachine machine;

    public SellOutState(DesignedMachine machine) {
        this.machine = machine;
    }

    @Override
    public void payMoney() {
        System.out.println("candy is sell out");
    }

    @Override
    public void drawBackButton() {
        System.out.println("candy is sell out");
    }

    @Override
    public void rotateButton() {
        System.out.println("candy is sell out");
    }

    @Override
    public void releaseCandy(int amount) {
        System.out.println("candy is sell out");
    }

}
