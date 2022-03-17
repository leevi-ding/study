package concurrent.atomic;

public class Test {
    public static void main(String[] args) {
//        unAtomicTest();
//        atomicTest();
//        atomicMultipleProcessDemo();
        multipleAtomicDemo();
    }

    private static void multipleAtomicDemo() {
        MultipleAtomicDemo multipleAtomicDemo = new MultipleAtomicDemo();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                Integer integer = multipleAtomicDemo.increaseCountAndGet();
                System.out.println("Thread A "+integer);
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                Integer integer = multipleAtomicDemo.increaseCountAndGet();
                System.out.println("Thread B "+integer);
            }
        }).start();
    }

    private static void atomicMultipleProcessDemo() {
        AtomicMultipleProcessDemo atomicMultipleProcessDemo = new AtomicMultipleProcessDemo();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                Integer integer = atomicMultipleProcessDemo.increaseCountAndGet();
                System.out.println("Thread A "+integer);
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                Integer integer = atomicMultipleProcessDemo.increaseCountAndGet();
                System.out.println("Thread B "+integer);
            }
        }).start();
    }

    private static void unAtomicTest() {
        UnAtomicDemo atomicDemo = new UnAtomicDemo();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                Integer integer = atomicDemo.increaseCountAndGet();
                System.out.println("Thread A "+integer);
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                Integer integer = atomicDemo.increaseCountAndGet();
                System.out.println("Thread B "+integer);
            }
        }).start();
    }

    private static void atomicTest() {
        AtomicDemo atomicDemo = new AtomicDemo();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                Integer integer = atomicDemo.increaseCountAndGet();
                System.out.println("Thread A "+integer);
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                Integer integer = atomicDemo.increaseCountAndGet();
                System.out.println("Thread B "+integer);
            }
        }).start();
    }

}
