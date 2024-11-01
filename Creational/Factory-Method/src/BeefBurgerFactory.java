import burger.BeefBurger;
import burger.Burger;

public class BeefBurgerFactory extends Restaurant{
    @Override
    public Burger createBurger(){
        return new BeefBurger();
    }
}
