package pattern.singleton;

import java.util.concurrent.CopyOnWriteArrayList;

public class Client {
    public static void main(String[] args) throws InterruptedException {
//        NonSafeSingletonDemo nonSafeSingletonDemo = NonSafeSingletonDemo.getInstance();
//        System.out.printf("this is the age of instance : %d", nonSafeSingletonDemo.getAge());
//
//        StaticSingletonDemo staticSingletonDemo = StaticSingletonDemo.getInstance();
//        System.out.printf("this is the age of instance : %d", staticSingletonDemo.getAge());

        CopyOnWriteArrayList<NonSafeSingletonDemo> list = new CopyOnWriteArrayList();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                NonSafeSingletonDemo instance = NonSafeSingletonDemo.getInstance();
                System.out.printf("NonSafeSingletonDemo : this is the age of instance : %s\n", instance);
                list.add(instance);
            }).start();
        }

        Thread.sleep(1000);
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.printf("StaticSingletonDemo : this is the age of instance : %s\n", StaticSingletonDemo.getInstance());
            }).start();
        }

        Thread.sleep(1000);
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.printf("OptimizedSafeSingletonDemo : this is the age of instance : %s\n", OptimizedSafeSingletonDemo.getInstance());
            }).start();
        }

        Thread.sleep(1000);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(i) != list.get(j)) {
                    System.out.println(list.get(i));
                    System.out.println(list.get(j));
                    System.out.printf("the different is %d : %d\n", i, j);
                }
            }
        }
    }
}
