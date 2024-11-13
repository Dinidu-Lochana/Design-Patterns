public class Main {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter("Ezio",100, 0);


        character.move(10);
        character.takeDamage(20);

        GameCharacter.Memento savedState = character.save();

        character.move(20);
        character.takeDamage(30);

        character.restore(savedState);
    }
}