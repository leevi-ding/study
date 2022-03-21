package pattern.template.predesign;

public class Coffee {
    public void prepare(){
        boilWater();
        breCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void boilWater() {
        System.out.println("boil water");
    }

    private void breCoffeeGrinds() {
        System.out.println("bre coffee grinds");
    }

    private void pourInCup() {
        System.out.println("pour in cup");
    }

    private void addSugarAndMilk() {
        System.out.println("add sugar and milk");
    }
}
