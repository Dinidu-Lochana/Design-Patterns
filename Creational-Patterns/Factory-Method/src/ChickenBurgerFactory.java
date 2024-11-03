import burger.BeefBurger;
import burger.Burger;
import burger.ChickenBurger;

public class ChickenBurgerFactory extends Restaurant{
    @Override
    public Burger createBurger(){
        return new ChickenBurger();
    }
}
