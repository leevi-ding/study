package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AbstractMenu {
    private String name;
    private String description;
    private List<MenuInterface> menuInterfaces = new ArrayList<>();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuInterface menuInterface) {
        this.menuInterfaces.add(menuInterface);
    }

    @Override
    public void remove(MenuInterface menuInterface) {
        this.menuInterfaces.remove(menuInterface);
    }

    @Override
    public MenuInterface getChild(int i) {
        return this.menuInterfaces.get(i);
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
    public void print() {
        System.out.printf("Menu %s\n", name);
        System.out.printf("description %s\n", description);
        System.out.println("-------------------");
        menuInterfaces.forEach(MenuInterface::print);
    }
}
