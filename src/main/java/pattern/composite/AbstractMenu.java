package pattern.composite;

public abstract class AbstractMenu implements MenuInterface {

    public void add(MenuInterface menu){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuInterface menu){
        throw new UnsupportedOperationException();
    }
    public MenuInterface getChild(int i){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public String getDescription(){
        throw new UnsupportedOperationException();
    }
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
    public String getTag(){
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }
}
