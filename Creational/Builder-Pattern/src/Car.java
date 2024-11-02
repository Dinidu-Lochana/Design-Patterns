public class Car {
    private final String Brand;
    private final String model;
    private final String color;
    private final int doors;

    Car(String Brand,String model,String color,int doors){
        this.Brand=Brand;
        this.model=model;
        this.color=color;
        this.doors=doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                '}';
    }
}
