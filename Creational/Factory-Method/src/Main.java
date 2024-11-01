 public class Main {
    public static void main(String[] args) {
        BeefBurgerFactory beefBurgerFactory = new BeefBurgerFactory();
        beefBurgerFactory.orderBurger();

        ChickenBurgerFactory chickenBurgerFactory = new ChickenBurgerFactory();
        chickenBurgerFactory.orderBurger();
    }
}