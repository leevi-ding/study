package pattern.composite;

public class Client {
    public static void main(String[] args) {
        Menu all = new Menu("All Menu", "food for all");
        MenuInterface breakfast = new Menu("breakfast", "food for morning");
        MenuInterface lunch = new Menu("lunch", "food for noon");
        MenuInterface dinner = new Menu("dinner", "food for evening");
        MenuItem egg = new MenuItem("egg", "egg", 1.0, "protein");
        MenuItem bread = new MenuItem("bread", "bread", 1.3, "carbohydrate");
        MenuItem pork = new MenuItem("pork", "pork", 2.3, "protein");
        MenuItem mutton = new MenuItem("mutton", "mutton", 3.2, "protein");
        MenuItem rice = new MenuItem("rice", "rice", 0.3, "carbohydrate");
        MenuItem broccoli = new MenuItem("broccoli", "broccoli", 0.9, "vegetable");
        breakfast.add(egg);
        breakfast.add(bread);
        lunch.add(pork);
        lunch.add(mutton);
        dinner.add(rice);
        dinner.add(broccoli);
        all.add(breakfast);
        all.add(lunch);
        all.add(dinner);
        all.print();
    }
}
