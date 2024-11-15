import lombok.Setter;

@Setter
public class PaymentService {

    private int cost=10000;

    private PaymentStrategy paymentStrategy;

    public void processOrder(){
        paymentStrategy.collectPaymentDetails();
        if(paymentStrategy.validatePaymentDetails(cost)){
            paymentStrategy.pay(cost);
        }
    }


}
