public class Main {
    public static void main(String[] args) {
        INotifier iNotifier = new FacebookDecorator(
                new WhatsappDecorator(
                        new Notifier("Hello World")
                )
        );
        iNotifier.send("This is Decorator Pattern");
    }
}