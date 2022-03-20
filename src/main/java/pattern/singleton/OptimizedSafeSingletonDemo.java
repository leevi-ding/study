package pattern.singleton;

import lombok.Getter;

public class OptimizedSafeSingletonDemo {
    @Getter
    private int age;
    private static OptimizedSafeSingletonDemo demo;
    private static Object lock = new Object();

    private OptimizedSafeSingletonDemo(int age) {
        this.age = age;
    }

    public static OptimizedSafeSingletonDemo getInstance() {
        if (demo == null) {
            synchronized (lock) {
                if (demo == null) {
                    demo = new OptimizedSafeSingletonDemo(1);
                }
            }
        }
        return demo;
    }
}
