package pattern.command.designed;

import pattern.command.designed.command.*;
import pattern.command.industry.AirConditional;
import pattern.command.industry.Curtain;
import pattern.command.industry.Kettle;
import pattern.command.industry.Television;

public class Controller {
    private Command[] commands = new Command[7];

    public void setCommand(int i , Command command){
        commands[i] = command;
    }

    public void function1(){
        commands[0].invoke();
    }
    public void function2(){
        commands[1].invoke();
    }
    public void function3(){
        commands[2].invoke();
    }
    public void function4(){
        commands[3].invoke();
    }
    public void function5(){
        commands[4].invoke();
    }
    public void function6(){
        commands[5].invoke();
    }
    public void function7(){
        commands[6].invoke();
    }

}
