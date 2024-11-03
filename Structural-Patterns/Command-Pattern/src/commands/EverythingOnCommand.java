package commands;

import hardware.AutoPilot;
import hardware.CruiseControl;

public class EverythingOnCommand implements Command{
    AutoPilot autoPilot;
    CruiseControl cruiseControl;

    public EverythingOnCommand(AutoPilot autoPilot, CruiseControl cruiseControl){
        this.autoPilot=autoPilot;
        this.cruiseControl=cruiseControl;
    }

    @Override
    public void execute(){
        System.out.println("Cruise Control and Autopilot has turned on");
        autoPilot.on();
        cruiseControl.on();
        autoPilot.setDestination("Galle");
        cruiseControl.setSpeed(100);
    }
}
