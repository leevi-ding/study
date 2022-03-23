package pattern.state.designed.state;

import pattern.state.designed.DesignedMachine;
import pattern.state.designed.State;

public class SellCandyState extends State {

    private DesignedMachine machine;

    public SellCandyState(DesignedMachine machine) {
        this.machine = machine;
    }

    @Override
    public void payMoney() {
        System.out.println("machine is releasing candy");
    }

    @Override
    public void drawBackButton() {
        System.out.println("machine is releasing candy");
    }

    @Override
    public void rotateButton() {
        System.out.println("machine is releasing candy");
    }

    @Override
    public void releaseCandy(int amount) {
        machine.setAmount(--amount);
        if (amount == 0) {
            machine.setState(machine.getSellOutState());
        } else {
            machine.setState(machine.getNoMoneyState());
        }
        System.out.printf("candy is released, amount left is %d\n", amount);
    }
}
