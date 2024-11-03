public class Main {
    public static void main(String[] args) {

        CarBuilder builder = new CarBuilder();
        builder.Brand("Mitsubishi")
                .color("white")
                .doors(4);
        Car car = builder.build();
        System.out.println(car);
    }
}