package concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 对一个原子性变量的操作如果不是原子性操作也会造成线程安全问题
 */
public class AtomicMultipleProcessDemo {
    private AtomicInteger count = new AtomicInteger(0);

    public Integer increaseCountAndGet() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            if (count.intValue() % 2 == 0) {
                return count.getAndAdd(1);
            }
            count.addAndGet(1);
        }
        return null;
    }
}
