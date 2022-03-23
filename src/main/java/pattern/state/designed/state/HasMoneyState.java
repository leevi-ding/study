package pattern.state.designed.state;

import pattern.state.designed.DesignedMachine;
import pattern.state.designed.State;

public class HasMoneyState extends State {

    private DesignedMachine machine;

    public HasMoneyState(DesignedMachine machine) {
        this.machine = machine;
    }

    @Override
    public void payMoney() {
        System.out.println("you have put in 25 cents");
    }

    @Override
    public void drawBackButton() {
        machine.setState(machine.getNoMoneyState());
        System.out.println("draw back your money");
    }

    @Override
    public void rotateButton() {
        machine.setState(machine.getSellCandyState());
        System.out.println("candy is waiting for release");
    }

    @Override
    public void releaseCandy(int amount) {
        System.out.println("candy is waiting for release");
    }
}
