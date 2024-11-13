import java.util.ArrayList;
import java.util.List;

public class GameCharacter {
    private String name;
    private int health;
    private int level;

    public GameCharacter(String name,int health,int level){
        this.name=name;;
        this.health=health;
        this.level=level;

    }

    public void takeDamage(int damage){
        health -= damage;
        System.out.println(damage + " damage, Current Health: " + health);
    }

    public void move(int newLevel) {
        level = newLevel;
        System.out.println("Moved to level : " + level);
    }

    public Memento save() {
        return new Memento(name,health, level);
    }

    public void restore(Memento memento) {
        this.name = memento.getName();
        this.health = memento.getHealth();
        this.level = memento.getLevel();

        System.out.println("Restored state: Name " +name+", Health=" + health + ", Position=" + level );
    }

    public static class Memento {

        private final String name;
        private final int health;
        private final int level;

        private Memento(String name,int health, int level) {
            this.name=name;
            this.health = health;
            this.level = level;
        }

        private int getHealth() {
            return health;
        }

        private int getLevel() {
            return level;
        }

        private String getName(){
            return name;
        }

    }
}
