package pattern.command.designed;

import pattern.command.designed.command.*;
import pattern.command.industry.AirConditional;
import pattern.command.industry.Curtain;
import pattern.command.industry.Kettle;
import pattern.command.industry.Television;

public class Client {

    public static void main(String[] args) {
        Controller controller = new Controller();
        setCommand(controller);

        // 函数调用
        controller.function1();
        controller.function2();
        controller.function3();
        controller.function4();
        controller.function5();
        controller.function6();
        controller.function7();
    }

    private static void setCommand(Controller controller){
        controller.setCommand(0,new AirConditionalCommand(new AirConditional()));
        controller.setCommand(1,new CurtainCommand(new Curtain()));
        controller.setCommand(2,new KettleCommand(new Kettle()));
        controller.setCommand(3,new TelevisionCommand(new Television()));
        controller.setCommand(4,new NonCommand());
        controller.setCommand(5,new NonCommand());
        controller.setCommand(6,new NonCommand());
    }
}
