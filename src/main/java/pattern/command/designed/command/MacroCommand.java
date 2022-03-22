package pattern.command.designed.command;

import pattern.command.designed.Command;
import pattern.command.industry.Curtain;
import pattern.command.industry.Television;

public class MacroCommand implements Command {

    private Television television;
    private Curtain curtain;

    public MacroCommand(Television television,Curtain curtain) {
        this.television = television;
        this.curtain = curtain;
    }

    @Override
    public void invoke() {
        television.on();
        curtain.on();
    }
}
