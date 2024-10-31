import commands.CruiseControlOff;
import commands.CruiseControlOn;
import commands.EverythingOffCommand;
import commands.EverythingOnCommand;
import hardware.AutoPilot;
import hardware.CruiseControl;

public class Main {
    public static void main(String[] args) {


        Tesla tesla = new Tesla();
        System.out.println(tesla);

         


       /*

       Tesla tesla=new Tesla();

        CruiseControl cruiseControl = new CruiseControl();

        tesla.setCommand(
                0,
                new CruiseControlOn(cruiseControl),
                new CruiseControlOff(cruiseControl)
        );

        System.out.println(tesla);

        tesla.activateSlot(0);
        tesla.deactivateSlot(0);

        */

        /*
        Tesla tesla = new Tesla();

        CruiseControl cruiseControl = new CruiseControl();
        AutoPilot autoPilot = new AutoPilot();

        tesla.setCommand(
                1,
                new EverythingOnCommand(autoPilot,cruiseControl),
                new EverythingOffCommand(autoPilot,cruiseControl)

        );

        System.out.println(tesla);

        tesla.activateSlot(1);
        tesla.deactivateSlot(1);

         */
    }
}