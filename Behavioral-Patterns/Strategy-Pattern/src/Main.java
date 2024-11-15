public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new PaymentByCreditCard());
        paymentService.processOrder();

        paymentService.setPaymentStrategy(new PaymentByPayPal());
        paymentService.processOrder();
    }
}