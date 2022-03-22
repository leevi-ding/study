package pattern.state.predesign;

public class Client {
    public static void main(String[] args) {
        AbstractCandyMachine candyMachine = new CandyMachine(10);
        candyMachine.drawBackButton();

        candyMachine.payMoneyButton();
        candyMachine.drawBackButton();

        candyMachine.payMoneyButton();
        candyMachine.rotateButton();
    }
}
