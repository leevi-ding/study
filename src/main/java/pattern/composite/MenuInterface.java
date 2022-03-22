package pattern.composite;

public interface MenuInterface {
    void add(MenuInterface menu);
    void remove(MenuInterface menu);
    MenuInterface getChild(int i);
    String getName();
    String getDescription();
    double getPrice();
    String getTag();
    void print();
}
