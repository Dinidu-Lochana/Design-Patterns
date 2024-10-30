package commands;

import hardware.CruiseControl;

public class CruiseControlOn implements Command{

    CruiseControl cruiseControl;

    public CruiseControlOn(CruiseControl cruiseControl){
        this.cruiseControl=cruiseControl;
    }

    @Override
    public void execute(){
        cruiseControl.setSpeed(100);
        cruiseControl.on();
    }
}
