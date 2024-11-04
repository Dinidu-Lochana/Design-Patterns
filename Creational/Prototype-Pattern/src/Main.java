public class Main {
    public static void main(String[] args) {
        Car originalCar = new Car();
        originalCar.setBrand("Toyota");
        originalCar.setModel("Corolla");
        originalCar.setColor("Red");
        originalCar.setTopSpeed(180);

        Car clonedCar = originalCar.clone();

        System.out.println("Original Car: " + originalCar);
        System.out.println("Cloned Car: " + clonedCar);

        Bus originalBus = new Bus();
        originalBus.setBrand("Mercedes");
        originalBus.setModel("Sprinter");
        originalBus.setColor("Blue");
        originalBus.setSeats(29);

        Bus clonedBus = originalBus.clone();

        System.out.println("Original Bus: " + originalBus);
        System.out.println("Cloned Bus: " + clonedBus);
    }
}
