package pattern.command.designed.command;

import pattern.command.designed.Command;
import pattern.command.industry.Kettle;
import pattern.command.industry.Television;

public class TelevisionCommand implements Command {

    private Television television;

    public TelevisionCommand(Television television) {
        this.television = television;
    }

    @Override
    public void invoke() {
        television.on();
    }
}
