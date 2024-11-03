package commands;

import hardware.AutoPilot;

public class AutoPilotOn implements Command{
    AutoPilot autoPilot;

    public AutoPilotOn(AutoPilot autoPilot){
        this.autoPilot=autoPilot;
    }

    @Override
    public void execute(){
        autoPilot.setDestination("Galle");
        autoPilot.on();
    }
}
