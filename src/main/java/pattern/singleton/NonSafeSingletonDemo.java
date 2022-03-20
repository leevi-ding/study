package pattern.singleton;

import lombok.Getter;

public class NonSafeSingletonDemo {
    @Getter
    private int age;
    private static NonSafeSingletonDemo demo;

    private NonSafeSingletonDemo(int age) {
        this.age = age;
    }

    public static NonSafeSingletonDemo getInstance(){
        if(demo == null){
            demo = new NonSafeSingletonDemo(1);
        }
        return demo;
    }
}
