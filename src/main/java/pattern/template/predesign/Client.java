package pattern.template.predesign;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepare();
        Tea tea = new Tea();
        tea.prepare();
    }
}
