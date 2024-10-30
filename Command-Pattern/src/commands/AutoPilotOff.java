package commands;

import hardware.AutoPilot;

public class AutoPilotOff implements Command{
    AutoPilot autoPilot;

    public AutoPilotOff(AutoPilot autoPilot){
        this.autoPilot=autoPilot;
    }

    @Override
    public void execute(){
        autoPilot.setDestination("");
        autoPilot.off();
    }
}
