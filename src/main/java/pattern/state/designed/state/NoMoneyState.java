package pattern.state.designed.state;

import pattern.state.designed.DesignedMachine;
import pattern.state.designed.State;

public class NoMoneyState extends State {

    private DesignedMachine machine;

    public NoMoneyState(DesignedMachine machine) {
        this.machine = machine;
    }

    @Override
    public void payMoney() {
        machine.setState(machine.getHasMoneyState());
        System.out.println("you put in 25 cents");
    }

    @Override
    public void drawBackButton() {
        System.out.println("you did not put in 25 cents");
    }

    @Override
    public void rotateButton() {
        System.out.println("you did not put in 25 cents");
    }

    @Override
    public void releaseCandy(int amount) {
        System.out.println("you did not put in 25 cents");
    }
}
