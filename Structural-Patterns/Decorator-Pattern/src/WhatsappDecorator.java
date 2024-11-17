public class WhatsappDecorator extends BaseNotifierDecorator{
    public WhatsappDecorator(INotifier wrapped){
        super(wrapped);
    }

    @Override
    public void send(String msg){
        super.send(msg);
        String phoneNumber = databaseService.getPhoneNumberFromUsername(getUsername());
        System.out.println("Sending " + msg+" by Whatsapp to "+ phoneNumber);
    }
}
