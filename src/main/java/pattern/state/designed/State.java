package pattern.state.designed;

public abstract class State {
    public void payMoney(){
        throw new UnsupportedOperationException();
    }
    public void drawBackButton(){
        throw new UnsupportedOperationException();
    }
    public void rotateButton(){
        throw new UnsupportedOperationException();
    }
    public void releaseCandy(int amount){
        throw new UnsupportedOperationException();
    }
}
