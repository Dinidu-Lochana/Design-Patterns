package commands;

import hardware.AutoPilot;
import hardware.CruiseControl;

public class EverythingOffCommand implements Command{
    AutoPilot autoPilot;
    CruiseControl cruiseControl;

    public EverythingOffCommand(AutoPilot autoPilot, CruiseControl cruiseControl){
        this.autoPilot=autoPilot;
        this.cruiseControl=cruiseControl;
    }


    @Override
    public void execute(){
        System.out.println("Cruise Control and Autopilot has turned off");
        autoPilot.off();
        cruiseControl.off();
        autoPilot.setDestination("");
        cruiseControl.setSpeed(0);
    }

}
