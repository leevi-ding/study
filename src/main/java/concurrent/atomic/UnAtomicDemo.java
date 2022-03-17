package concurrent.atomic;

public class UnAtomicDemo {
    private Integer count = new Integer(0);

    public Integer increaseCountAndGet() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ++count;
    }
}
