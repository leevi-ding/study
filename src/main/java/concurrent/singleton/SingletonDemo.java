package concurrent.singleton;

public class SingletonDemo {
    private Object instance = null;
    public Object getInstance(){
        if(instance == null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Object();
        }
        return instance;
    }
}
