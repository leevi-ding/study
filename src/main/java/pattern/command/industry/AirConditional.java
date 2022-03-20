package pattern.command.industry;

public class AirConditional {

    private int temperature = 26;

    public void on(){
        System.out.println("air conditional on");
    }
    public void off(){
        System.out.println("air conditional off");
    }
    public void turnUp(){
        System.out.printf("air temperature is %d°C now\n",++temperature);
    }
    public void turnDown(){
        System.out.printf("air temperature is %d°C now\n",--temperature);
    }
}
