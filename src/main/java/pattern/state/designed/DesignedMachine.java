package pattern.state.designed;

import lombok.Getter;
import lombok.Setter;
import pattern.state.designed.state.HasMoneyState;
import pattern.state.designed.state.NoMoneyState;
import pattern.state.designed.state.SellCandyState;
import pattern.state.designed.state.SellOutState;

public class DesignedMachine extends CandyMachineInterface {
    @Setter
    private int amount;

    @Getter
    private State noMoneyState;
    @Getter
    private State hasMoneyState;
    @Getter
    private State sellCandyState;
    @Getter
    private State sellOutState;

    @Setter
    private State state;

    public DesignedMachine(int amount) {
        this.amount = amount;
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        sellCandyState = new SellCandyState(this);
        sellOutState = new SellOutState(this);
        state = noMoneyState;
    }

    @Override
    public void payMoney() {
        System.out.println("------------- pay money -------------");
        state.payMoney();
    }

    @Override
    public void drawBackButton() {
        System.out.println("------------- draw back money -------------");
        state.drawBackButton();
    }

    @Override
    public void rotateButton() {
        System.out.println("------------- rotate button -------------");
        state.rotateButton();
    }

    @Override
    public void releaseCandy() {
        System.out.println("------------- release candy -------------");
        state.releaseCandy(amount);
    }
}
