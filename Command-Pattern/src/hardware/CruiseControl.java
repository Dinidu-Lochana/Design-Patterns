package hardware;

public class CruiseControl {

    private int speed;

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        System.out.println("Setting speed to : "+ speed);
        this.speed=speed;
    }

    public void on(){
        System.out.println("Turning on Cruise Control");
    }

    public void off(){
        System.out.println("Turning off Cruise Control");
    }
}
