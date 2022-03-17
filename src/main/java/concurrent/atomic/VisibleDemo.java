package concurrent.atomic;

public class VisibleDemo {
    private int number;
    private boolean ready = false;

    public static void main(String[] args) throws InterruptedException {
        VisibleDemo v = new VisibleDemo();
        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(v.number);
        }).start();
        v.ready = true;
        v.number = 42;
    }
}
