package pattern.state.optimized;

public class Client {
    public static void main(String[] args) {
        OptimizedCandyMachine optimizedCandyMachine = new OptimizedCandyMachine(10);

        optimizedCandyMachine.drawBackButton();

        optimizedCandyMachine.payMoneyButton();
        optimizedCandyMachine.drawBackButton();

        optimizedCandyMachine.payMoneyButton();
        optimizedCandyMachine.rotateButton();

        for (int i = 0; i < 10; i++) {
            optimizedCandyMachine.payMoneyButton();
            optimizedCandyMachine.rotateButton();
        }
    }
}
