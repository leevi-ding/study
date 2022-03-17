package concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * count 每次加1
 */
public class AtomicDemo {
    private AtomicInteger count = new AtomicInteger(0);

    public Integer increaseCountAndGet() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return count.addAndGet(1);
    }
}
