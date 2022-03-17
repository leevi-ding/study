package concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 多个线程安全对象的 非线程安全操作 也会造成线程安全问题
 */
public class MultipleAtomicDemo {

    private AtomicInteger countA = new AtomicInteger(0);
    private AtomicInteger countB = new AtomicInteger(20);

    public Integer increaseCountAndGet() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        synchronized (this) {
            if (countA.intValue() <= countB.intValue()) {
                countA.addAndGet(2);
                countB.addAndGet(1);
            }
            return countA.intValue();
//        }
    }
}
