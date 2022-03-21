package pattern.template.designed;

public class Client {
    public static void main(String[] args) {
        BeverageTemplate coffee = new Coffee();
        BeverageTemplate tea = new Tea();
        coffee.prepare();
        tea.prepare();
    }
}
