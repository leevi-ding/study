package concurrent.threadsafe;

import java.util.ArrayList;
import java.util.List;

public class ThreadLocalDemo {

    private final ThreadLocal<List> connection = new ThreadLocal(){
        @Override
        public List initialValue(){
            return new ArrayList<String>();
        }
    };

    private List getConnection(){
        return connection.get();
    }

    public static void main(String[] args) {
        ThreadLocalDemo threadLocalDemo = new ThreadLocalDemo();
        for (int i = 0; i < 10; i++) {
            List list = threadLocalDemo.getConnection();
            int finalI = i;
            new Thread(() -> {
                list.add("i:"+ finalI);
                System.out.println(list);
            }).start();
        }
    }

}
