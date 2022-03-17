package uml;

public class Demo {
    private Composition composition;

    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    public void calculate(){
        int age = composition.getAge();
        System.out.println(age);
    }
}
