package pattern.decorator.predesign;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Beverage {

    private double price;
    private String describe;
    private SizeEnum size =  SizeEnum.cuvette;
    private List<Ingredient> ingredients = new ArrayList<>();

    public Beverage(double price, String describe) {
        this.price = price;
        this.describe = describe;
    }

    public double cost() {
        if (ingredients != null && ingredients.size() != 0) {
            ingredients.forEach(ingredient -> {
                price += ingredient.cost();
            });
        }
        price += size.getValue();
        return price;
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public void describe() {
        System.out.println(describe);
        if (ingredients != null && ingredients.size() != 0) {
            ingredients.forEach(ingredient -> {
                ingredient.describe();
            });
        }
        System.out.println("price is " + price);
    }
}
