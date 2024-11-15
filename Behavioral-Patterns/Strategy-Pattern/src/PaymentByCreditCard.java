public class PaymentByCreditCard implements PaymentStrategy{
    private CreditCard creditCard;

    @Override
    public void collectPaymentDetails(){
        creditCard = new CreditCard("11111","2024","123");

    }

    @Override
    public boolean validatePaymentDetails(int amount){
        if((creditCard.getBalance()-amount)>0)
        {
            return true;
        }
        System.out.println("Unavailable Balance");
        return false;
    }

    @Override
    public void pay(int amount){
        System.out.println("Credit Card Payment : "+amount);
        creditCard.setBalance(creditCard.getBalance()-amount);
    }
}
