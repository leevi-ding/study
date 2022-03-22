package pattern.state.optimized;

import pattern.state.predesign.AbstractCandyMachine;

public class OptimizedCandyMachine extends AbstractCandyMachine {
    private State state = State.NO_MONEY;
    private int amount;

    public OptimizedCandyMachine(int amount) {
        this.amount = amount;
    }

    enum State {
        NO_MONEY,
        HAS_MONEY,
        SELL_CANDY,
        SELL_OUT;
    }

    @Override
    public void payMoneyButton() {
        System.out.print("push payMoneyButton ------ ");
        if (this.state.equals(State.NO_MONEY)) {
            this.state = State.HAS_MONEY;
            System.out.println("pay 25 cents");
        } else if (this.state.equals(State.HAS_MONEY)) {
            drawBack();
            System.out.println("you have put 25 cents");
        } else if (this.state.equals(State.SELL_CANDY)) {
            this.state = State.HAS_MONEY;
            System.out.println("you have put 25 cents");
        } else if (this.state.equals(State.SELL_OUT)) {
            drawBack();
            System.out.println("candy is cell out");
        }
    }

    @Override
    public void drawBackButton() {
        System.out.print("push drawBackButton ------ ");
        if (this.state.equals(State.NO_MONEY)) {
            System.out.println("you don't put in 25 cents");
        } else if (this.state.equals(State.HAS_MONEY)) {
            this.state = State.NO_MONEY;
            drawBack();
        } else if (this.state.equals(State.SELL_CANDY)) {
            refreshMachine();
            System.out.println("you don't put in 25 cents");
        } else if (this.state.equals(State.SELL_OUT)) {
            System.out.println("you don't put in 25 cents");
        }
    }

    @Override
    public void rotateButton() {
        System.out.print("push rotateButton ------ ");
        if (this.state.equals(State.NO_MONEY)) {
            System.out.println("you don't put in 25 cents");
        } else if (this.state.equals(State.HAS_MONEY)) {
            if (amount == 0) {
                this.state = State.SELL_OUT;
                sellOut();
            } else {
                amount--;
                this.state = State.SELL_CANDY;
                dropOutCandy();
            }
        } else if (this.state.equals(State.SELL_CANDY)) {
            System.out.println("please wait for machine refresh");
        } else if (this.state.equals(State.SELL_OUT)) {
            System.out.println("you don't put in 25 cents");
            drawBack();
        }
    }

    private void drawBack() {
        System.out.println("draw back your money");
    }

    private void dropOutCandy() {
        System.out.printf("drop your candy, the amount is %d now\n", amount);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.state = State.NO_MONEY;
        refreshMachine();
    }

    private void sellOut() {
        System.out.println("sell out");
    }

    private void refreshMachine() {
        System.out.println("you can put in 25 cents");
    }
}
