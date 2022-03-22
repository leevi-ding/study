package pattern.state.predesign;

public class CandyMachine extends AbstractCandyMachine {
    private int amount;
    private int money;

    public CandyMachine(int amount) {
        this.amount = amount;
        this.money = 0;
    }

    @Override
    public void payMoneyButton() {
        if (money == 25) {
            System.out.println("payMoneyButton ------ you have put 25 cents");
            return;
        }else {
            money = 25;
            System.out.println("payMoneyButton ------ pay 25 cents");
        }
    }

    @Override
    public void drawBackButton() {
        if (money == 25) {
            System.out.println("drawBackButton ------ ");
            drawBack();
        } else {
            System.out.println("drawBackButton ------ you don't put in 25 cents");
        }
    }

    private void drawBack() {
        money = 0;
        System.out.println("draw back your money");
    }

    @Override
    public void rotateButton() {
        System.out.print("drawBackButton ------ ");
        if (money == 25) {

            dropOutCandy();
        }else{
            System.out.println("drawBackButton ------ you don't put in 25 cents");
        }
    }

    private void dropOutCandy() {
        if (amount > 0) {
            amount--;
            System.out.printf("drop your candy, the amount is %d now\n", amount);
        } else {
            System.out.println("candy is cell out");
            drawBack();
        }
    }
}
