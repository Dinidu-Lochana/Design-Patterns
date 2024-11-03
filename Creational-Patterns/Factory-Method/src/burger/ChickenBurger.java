package burger;

public class ChickenBurger implements Burger{

    @Override
    public void prepare(){
        System.out.println("Preparing a Chicken Burger");
    }
}
