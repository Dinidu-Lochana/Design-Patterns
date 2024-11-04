public class Vehicle {
    private String brand;
    private String model;
    private String color;

    public Vehicle() {
    }

    protected Vehicle(Vehicle vehicle){
        this.brand=vehicle.brand;
        this.model= vehicle.model;
        this.color= vehicle.color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
