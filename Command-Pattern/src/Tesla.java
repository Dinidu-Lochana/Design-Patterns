import commands.Command;
import commands.NoOpCommand;

public class Tesla {

    Command[] onCommands;
    Command[] offCommands;

    int slots=3;

    public Tesla(){
        onCommands = new Command[slots];
        offCommands = new Command[slots];

        for (int i=0;i<slots;i++){
            onCommands[i]=new NoOpCommand();
            offCommands[i]=new NoOpCommand();
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        if (onCommand == null || offCommand == null) {
            throw new IllegalArgumentException("Commands cannot be null!");
        } else {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }
    }

    public void activateSlot(int slot) {
        onCommands[slot].execute();
    }

    public void deactivateSlot(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n----Tesla-----\n");
        for (int i = 0; i < slots; i++) {stringBuilder.append("Slot #" + i + " - " + onCommands[i].getClass().getSimpleName() + "(" + onCommands.getClass().getSimpleName() + ")" +
                    " - " + offCommands[i].getClass().getSimpleName() + "(" + offCommands.getClass().getSimpleName() + ")" +
                    "\n");
        }
        return stringBuilder.toString();
    }
}
