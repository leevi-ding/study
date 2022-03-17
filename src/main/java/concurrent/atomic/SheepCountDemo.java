package concurrent.atomic;

public class SheepCountDemo {
    private volatile boolean asleep;

    public static void main(String[] args) {
        SheepCountDemo sheepCountDemo = new SheepCountDemo();
        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sheepCountDemo.asleep = true;
        }).start();
        while (!sheepCountDemo.asleep){
            sheepCountDemo.countSheep();
        }
    }

    private void countSheep() {
    }
}
