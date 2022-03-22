package pattern.composite;

public class MenuItem extends AbstractMenu {
    private String name;
    private String description;
    private double price;
    private String tag;

    public MenuItem(String name, String description, double price, String tag) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.tag = tag;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getTag() {
        return this.tag;
    }

    @Override
    public void print() {
        System.out.printf("%s---------",name);
        System.out.printf("%f\n", price);
    }
}
