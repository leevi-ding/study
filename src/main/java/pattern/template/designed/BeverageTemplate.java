package pattern.template.designed;

public abstract class BeverageTemplate {

    public void prepare(){
        boilWater();
        prepareSomething();
        pourInCup();
        addSomething();
        if(judgement()){
            hook();
        }
    }

    protected abstract void prepareSomething();

    protected abstract void addSomething();

    private final void  boilWater() {
        System.out.println("boil water");
    }

    private final void pourInCup() {
        System.out.println("pour in cup");
    }

    protected boolean judgement(){
        return false;
    }
    protected void hook(){

    }
}
