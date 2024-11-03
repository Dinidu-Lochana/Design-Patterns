public class CarBuilder {
    private String Brand;
    private String model;
    private String color;
    private int doors;

    public CarBuilder Brand(String brand){
        this.Brand=brand;
        return this;
    }

    public CarBuilder model(String model){
        this.model=model;
        return this;
    }

    public CarBuilder color(String color){
        this.color=color;
        return this;
    }

    public CarBuilder doors(int doors){
        this.doors=doors;
        return this;
    }

    public Car build(){
        return new Car(Brand,model,color,doors);
    }
}
