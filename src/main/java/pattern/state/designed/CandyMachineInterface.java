package pattern.state.designed;

/**
 * 三个按钮
 * 付钱
 * 退钱
 * 出货
 */
public abstract class CandyMachineInterface {
    public void payMoney(){
        throw new UnsupportedOperationException();
    }

    public void drawBackButton(){
        throw new UnsupportedOperationException();
    }

    public void rotateButton(){
        throw new UnsupportedOperationException();
    }

    public void releaseCandy(){
        throw new UnsupportedOperationException();
    }

    public void fillCandy(){
        throw new UnsupportedOperationException();
    }
}
