package pattern.state.designed;

public class Client {
    public static void main(String[] args) {
        DesignedMachine designedMachine = new DesignedMachine(10);

        designedMachine.drawBackButton();

        designedMachine.payMoney();
        designedMachine.drawBackButton();

        designedMachine.payMoney();
        designedMachine.rotateButton();
        designedMachine.releaseCandy();

        for (int i = 0; i < 10; i++) {
            designedMachine.payMoney();
            designedMachine.rotateButton();
            designedMachine.releaseCandy();
        }

        designedMachine.fillCandy();
    }
}
