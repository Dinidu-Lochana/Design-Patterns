package hardware;

public class AutoPilot {

    String destination;

    public String getDestination(){
        return destination;
    }

    public void setDestination(String destination){
        System.out.println("Starting to go : " + destination );
        this.destination=destination;
    }

    public void on(){
        System.out.println("Turning on AutoPilot");
    }

    public void off(){
        System.out.println("Turning off AutoPilot");
    }
}
