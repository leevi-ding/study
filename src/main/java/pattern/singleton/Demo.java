package pattern.singleton;

public class Demo {
    private int age;
    private static Demo demo;


    private Demo(int age) {
        this.age = age;
    }

    public static Demo getInstance(){
        if(demo == null){
            demo = new Demo(1);
        }
        return demo;
    }
}
