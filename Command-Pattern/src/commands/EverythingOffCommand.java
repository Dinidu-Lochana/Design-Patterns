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
        System.out.println("It's Wake Up Time");
        autoPilot.off();
        cruiseControl.off();
        autoPilot.setDestination("");
        cruiseControl.setSpeed(0);
    }

}
