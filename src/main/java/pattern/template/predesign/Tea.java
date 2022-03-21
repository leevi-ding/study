package pattern.template.predesign;

public class Tea {
    public void prepare(){
        boilWater();
        steepTeaBag();
        addLemon();
        pourInCup();
    }

    private void addLemon() {
        System.out.println("add lemon");
    }

    private void steepTeaBag() {
        System.out.println("steep tea bag");
    }

    private void boilWater() {
        System.out.println("boil water");
    }

    private void pourInCup() {
        System.out.println("pour in cup");
    }

}
