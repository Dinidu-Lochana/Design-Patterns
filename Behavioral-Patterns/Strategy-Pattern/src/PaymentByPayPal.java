public class PaymentByPayPal implements PaymentStrategy{
    private PayPal payPal;

    @Override
    public void collectPaymentDetails(){
        payPal = new PayPal("1234@gmail.com","124");
    }

    @Override
    public boolean validatePaymentDetails(int amount){
        if((payPal.getBalance()-amount)>0)
        {
            return true;
        }
        System.out.println("Unavailable Balance");
        return false;
    }

    @Override
    public void pay(int amount){
        System.out.println("PayPal Payment : "+amount);
        payPal.setBalance(payPal.getBalance()-amount);
    }

}
