import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<EventListener> customers;

    public NotificationService() {
        customers = new ArrayList<>();
    }

    public void subscribe(EventListener listener) {
        customers.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        customers.remove(listener);
    }

    public void notifySubscribers() {
        customers.forEach(listener -> listener.update());
    }
}
