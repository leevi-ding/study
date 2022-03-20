package pattern.singleton;

import lombok.Getter;

public class StaticSingletonDemo {
    @Getter
    private int age;
    private static StaticSingletonDemo demo = new StaticSingletonDemo(1);

    private StaticSingletonDemo(int age) {
        this.age = age;
    }

    public static StaticSingletonDemo getInstance(){
        return demo;
    }
}
