package pattern.command.predesign;

import pattern.command.industry.AirConditional;
import pattern.command.industry.Curtain;
import pattern.command.industry.Kettle;
import pattern.command.industry.Television;

public class Controller {
    private AirConditional airConditional = new AirConditional();
    private Curtain curtain = new Curtain();
    private Kettle kettle = new Kettle();
    private Television television = new Television();

    public void function1(){
        airConditional.on();
    }
    public void function2(){
        curtain.on();
    }
    public void function3(){
        kettle.on();
    }
    public void function4(){
        television.on();
    }
    public void function5(){
    }
    public void function6(){
    }
    public void function7(){
    }
}
