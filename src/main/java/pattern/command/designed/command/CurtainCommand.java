package pattern.command.designed.command;

import pattern.command.designed.Command;
import pattern.command.industry.AirConditional;
import pattern.command.industry.Curtain;

public class CurtainCommand implements Command {

    private Curtain curtain;

    public CurtainCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void invoke() {
        curtain.on();
    }
}
