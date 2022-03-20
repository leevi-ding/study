package pattern.command.designed.command;

import pattern.command.designed.Command;
import pattern.command.industry.Curtain;
import pattern.command.industry.Kettle;

public class KettleCommand implements Command {

    private Kettle kettle;

    public KettleCommand(Kettle kettle) {
        this.kettle = kettle;
    }

    @Override
    public void invoke() {
        kettle.on();
    }
}
