package pattern.command.designed;

import pattern.command.designed.command.*;
import pattern.command.industry.AirConditional;
import pattern.command.industry.Curtain;
import pattern.command.industry.Kettle;
import pattern.command.industry.Television;

public class Client {
    public static void main(String[] args) {
        Controller client = new Controller();
        client.setCommand(0,new AirConditionalCommand(new AirConditional()));
        client.setCommand(1,new CurtainCommand(new Curtain()));
        client.setCommand(2,new KettleCommand(new Kettle()));
        client.setCommand(3,new TelevisionCommand(new Television()));
        client.setCommand(4,new NonCommand());
        client.setCommand(5,new NonCommand());
        client.setCommand(6,new NonCommand());
        client.function1();
        client.function2();
        client.function3();
        client.function4();
        client.function5();
        client.function6();
        client.function7();
    }
}
