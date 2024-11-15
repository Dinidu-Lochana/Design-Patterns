public interface PaymentStrategy {
    void collectPaymentDetails();
    boolean validatePaymentDetails(int amount);
    void pay(int amount);
}
