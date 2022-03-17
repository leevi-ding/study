package concurrent.singleton;

public class SingletonTest {
    public static void main(String[] args){
        SingletonDemo singletonDemo = new SingletonDemo();
        new Thread(()->{
            Object instance = singletonDemo.getInstance();
            System.out.println(instance.hashCode());
        }).start();
        new Thread(()->{
            Object instance = singletonDemo.getInstance();
            System.out.println(instance.hashCode());
        }).start();
    }
}
