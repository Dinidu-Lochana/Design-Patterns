public class Store {
    private final NotificationService notificationService;

    public Store(){
        notificationService = new NotificationService();
    }

    public void newItemPromotion(){
        notificationService.notifySubscribers();
    }

    public NotificationService getService(){
        return notificationService;
    }
}
