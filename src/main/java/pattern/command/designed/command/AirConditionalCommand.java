package pattern.command.designed.command;

import pattern.command.designed.Command;
import pattern.command.industry.AirConditional;

public class AirConditionalCommand implements Command {

    private AirConditional airConditional;

    public AirConditionalCommand(AirConditional airConditional) {
        this.airConditional = airConditional;
    }

    @Override
    public void invoke() {
        airConditional.on();
    }
}
