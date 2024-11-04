public class Bus extends Vehicle{
    private int seats;

    public Bus(){

    }
    public Bus(Bus bus){
        super(bus);
        this.seats= bus.seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public Bus clone(){
        System.out.println("Cloned Bus");
        return new Bus(this);
    }
}
