package pattern.singleton;

import lombok.Getter;

public class SafeSingletonDemo {
    @Getter
    private int age;
    private static SafeSingletonDemo demo;

    private SafeSingletonDemo(int age) {
        this.age = age;
    }

    public synchronized static SafeSingletonDemo getInstance(){
        if(demo == null){
            demo = new SafeSingletonDemo(1);
        }
        return demo;
    }
}
