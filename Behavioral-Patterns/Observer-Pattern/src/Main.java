public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        store.getService().subscribe(new EmailMsgListener("abcd2gmail.com"));

        store.getService().subscribe(new MobileAppListener("abcd"));
        store.newItemPromotion();

    }
}