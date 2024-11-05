package commands;

import hardware.CruiseControl;

public class CruiseControlOff implements Command{

    CruiseControl cruiseControl;

    public CruiseControlOff(CruiseControl cruiseControl){
        this.cruiseControl=cruiseControl;
    }

    @Override
    public void execute(){
        cruiseControl.setSpeed(0);
        cruiseControl.off();
    }
}
